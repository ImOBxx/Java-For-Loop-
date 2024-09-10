package ifloop;

import java.util.Scanner;

public class Library_Charges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of Days : ");
		int days = in.nextInt();
		int amt;
		if (days > 0 && days <= 5)
		{
			amt = (int) 0.05 * days;
			System.out.println("Fine Amount Pay to Rs : " + amt);
		}
		else if (days >= 6 && days <= 10)
		{
			amt = 1 * days;
			System.out.println("Fine amount pay to Rs : " + amt);
		}
		else if (days > 10)

		{
			amt = 5 * days;
			System.out.println("Fine Amount pay to Rs : " + amt);
			if (days > 30)
			{
				System.out.println("Your Membership would be cancelled..");
			}
			
		}
		else 
		{ 
			System.out.println("Invalid");
		}
			}
			
		
		

	}


