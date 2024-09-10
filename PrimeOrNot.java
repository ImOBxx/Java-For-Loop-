package forloop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count = 0; 
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		for (i = 2; i < n; i++)
		{
			if (n % i == 0);
			{
			count++;
			break;
			}
				
		}
		if (count == 2)
		
			System.out.println("Number Is A Prime Number");
		
		else
		
			System.out.println("Number Is Not A Prime Number");
		

	}

}
