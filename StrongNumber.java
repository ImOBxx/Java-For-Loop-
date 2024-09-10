package forloop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Strong Number: ");
		int n = in.nextInt();
		int i, n1, s1 = 0, j;
		int fact;
		n1 = n;
		for (j = n; j > 0; j = j / 10)
		{
			fact = 1;
			for (i = 1; i <= j % 10; i++)
			{
				s1 = s1 + fact;
			}
			if (s1 == n1)
			{
				System.out.println("Strong Number : " + n1);
			}
			else
			{
				System.out.println("Not a Strong Number : " + n1);
			}
		}

	}

}
