package ifloop;

import java.util.Scanner;

public class reverse_equalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Digits: ");
		int num = in.nextInt();
		int rem, sum = 0, a = num;
		while (num > 0)
		{
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (a == sum)
			System.out.println("Equal..");
		else 
			System.out.println("Not Equal..");
		}
		

	}

