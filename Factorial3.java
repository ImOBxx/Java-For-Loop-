package forloop;

import java.util.Scanner;

public class Factorial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Number! : ");
		n = in.nextInt();
		int f = 1;
		
		for (int i = 1; i <= n; i++)
		{
			f = f * i;
		}
		System.out.println("Factorial Of " + n + " is: " + f);

	}

}
