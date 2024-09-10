package forloop;

import java.util.Scanner;

public class Average10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int x, i, sum = 0;
		double avg = 0;
		for (i = 1; i <= 10; i++)
		{
			System.out.print("Enter Number: ");
			x = in.nextInt();
			sum = sum + x;
			avg = sum / 10.0;
			
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);

	}

}
