package forloop;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i, f = 1;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number For Factorial: ");
		x = in.nextInt();
		for (i = 1; i <= x; i++)
		{
			f = f * i;
		}
		System.out.println("Factorial of " + x + ": " + f);

	}

}
