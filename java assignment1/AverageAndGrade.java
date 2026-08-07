import java.util.Scanner;

public class AverageAndGrade{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);



int main() {
    int marks[5];
    int sum = 0;
    float average;
    int i;

    
    printf("Enter marks of 5 subjects:\n");
    for (i = 0; i < 5; i++) {
        printf("Subject %d: ", i + 1);
        scanf("%d", &marks[i]);
        sum += marks[i];
    }
    average = sum / 5.0;

        printf("\nAverage Marks = %.2f\n", average);


    if (average >= 90) {
        printf("Grade: A\n");
    } else if (average >= 75) {
        printf("Grade: B\n");
    } else if (average >= 50) {
        printf("Grade: C\n");
    } else {
        printf("Grade: Fail\n");
    }

    return 0;
}