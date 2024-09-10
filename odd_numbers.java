package forloop;

import java.util.Scanner;

public class odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n, sum = 0;
		System.out.println("Enter the Number limit: ");
		n = in.nextInt();
		for (int s = 1; s <= n; s++)
		{
			if (s % 2 == 1)
				System.out.println(s);
			    sum = sum + s;
		}
		System.out.println("Sum Of All Numbers: " + sum);
		

	}

}
