import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;

		while (i <= 50) {
			if (i % 2 == 0 ) {
				sum = sum + i;
			}
			i++;
		}

		System.out.println("Sum of all even numbers between 1 and 50 = " + sum);

	}
}
		