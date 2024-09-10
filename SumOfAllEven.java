package forloop;

import java.util.Scanner;

public class SumOfAllEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, x, i;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter The Nth Term: ");
		x = in.nextInt();
		for (i = 1; i <= x; i++)
		{
			   if (i % 2 == 0)
		       System.out.println(i);
			   sum = sum + i;
	    }
		System.out.println(sum);
	}
			}
		
		

	


