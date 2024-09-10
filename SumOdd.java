package forloop;

import java.util.Scanner;

public class SumOdd {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input the Number Limit: ");
		int n = in.nextInt();
		int sum = 0;
		int s;
		for (s = 1; s <= n; s++);
		{ 
				if (s % 2 == 1)
					sum = sum + s;
			{
				System.out.println("Sum of the Odd Numbers : " + sum);
			}
		    

	}
		

}
}
