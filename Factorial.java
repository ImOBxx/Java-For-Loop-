package forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter factorial number : ");
		int num = in.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++)
		{
			fact *= i;
			
		}
		System.out.println("Factorial: " + fact);

	}

}
