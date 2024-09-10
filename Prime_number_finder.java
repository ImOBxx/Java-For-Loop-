package forloop;

import java.util.Scanner;

public class Prime_number_finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = in.nextInt();
		int i, count = 0;
		for (i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println("This is a Prime Number.");
		else
			System.out.println("This is not a Prime Number.");
	}


			
			
				
		
		
		

	}
