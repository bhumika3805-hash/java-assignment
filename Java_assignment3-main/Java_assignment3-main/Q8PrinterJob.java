import java.util.Scanner;

class PrinterJob implements Runnable {
    int jobNumber;
    String studentName;

    PrinterJob(int jobNumber, String studentName) {
        this.jobNumber = jobNumber;
        this.studentName = studentName;
    }

    public void run() {
        System.out.println(
            "Printing job " + jobNumber + " by " + studentName
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted");
        }
    }
}

public class Q8PrinterJob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of print jobs: ");
        int n = sc.nextInt();

        // Ensure at least two print jobs so that multiple threads are created.
        if (n < 2) {
            System.out.println("At least two print jobs are required. Setting number of jobs to 2.");
            n = 2;
        }

        for (int i = 1; i <= n; i++) {
            String student = "Student " + (char)('A' + i - 1);

            Thread thread = new Thread(
                new PrinterJob(i, student)
            );

            thread.start();
        }

        sc.close();
    }
}