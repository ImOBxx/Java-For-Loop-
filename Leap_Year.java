package ifloop;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Your Year :");
			
			int year = in.nextInt();
			boolean flag = false;
			if (year % 400 == 0)
				flag = true;
			else if (year % 100 == 0)
				flag = false;
			else if (year % 4 == 0)
				flag = true;
			else 
				flag = false;
			if (flag)
			{
				System.out.println("Year " + year + " is a Leap Year");
			}
			else 
			{
				System.out.println("Year " + year + " is not a Leap year");
			}
		}
		
			

	}

}
