package forloop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Base Number : ");
		int base = in.nextInt();
		System.out.println("Enter the Power Number : ");
		int power = in.nextInt();
		int result = 1;
		for (int i = 1; i <= power; i++)
		{
			result *= base;
			
		}
		System.out.println("Result: " + result);
		
				

	}

}
