package forloop;

import java.util.Scanner;

public class ReverseTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i, sum;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		x = in.nextInt();
		for (i = 10; i >= 1; i--)
		{
			sum = x * i;
			System.out.println(x + " x " + i + " = " + sum);
		}
		

	}

}
