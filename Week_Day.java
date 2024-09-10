package ifloop;

import java.util.Scanner;

public class Week_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Week Number(1 - 7): ");
		int num = in.nextInt();
		System.out.println("\n");
		if (num == 1)
			System.out.println("Monday");
		else if (num == 2)
			System.out.println("Tuesday");
		else if (num == 3)
			System.out.println("Wednesday");
		else if (num == 4)
			System.out.println("Thursday");
		else if (num == 5)
			System.out.println("Friday");
		else if (num == 6)
		    System.out.println("Saturday");
		else if (num == 7)
		    System.out.println("Sunday");
		else 
			System.out.println("Enter a number between 1 - 7.");
		

	}
}
