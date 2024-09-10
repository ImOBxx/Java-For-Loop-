package forloop;

import java.util.Scanner;

public class Calculate_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int dividend = in.nextInt();
		System.out.println("Enetr the second number : ");
		int divisor = in.nextInt();
		int rem, hcf = 0;
		do 
		{
			rem = dividend % divisor;
			if (rem == 0)
			{
				hcf = divisor;
			}
			else 
			{
				dividend = divisor;
				divisor = rem;
			}
		}
		while (rem != 0);
		System.out.println("HCF : " + hcf);
		
			}
		

	}


