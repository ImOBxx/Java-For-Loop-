package forloop;

import java.util.Scanner;

public class SumNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number limit : ");
		int n = in.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of Numbers : " + sum);
		

	}

}
