package forloop;

import java.util.Scanner;

public class Sum_Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Limit : ");
		int n = in.nextInt();
		int sum = 0;
		for (int s = 1; s <= n; s++)
		{
			if (s % 2 == 0)
				System.out.println(s);
				sum = sum + s;
		}
			System.out.println("Sum of even numbers : " + sum);
		

	}

}
