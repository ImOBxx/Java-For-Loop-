package ifloop;

import java.util.Scanner;

public class Employee_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int y, b;
		System.out.println("Input no. of years worked: ");
		y = in.nextInt();
		if (y >= 3)
		{
			System.out.println("You have received a bonus of 2500/-");
			
		}
		else 
		{
			System.out.println("\n");
		}

	}

}
