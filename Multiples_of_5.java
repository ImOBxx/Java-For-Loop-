package ifloop;

import java.util.Scanner;

public class Multiples_of_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Number: ");
		Scanner in = new Scanner (System.in);
		int num = in.nextInt();
		if (num % 5 == 0)
		{
			System.out.println(num + " is a Multiple of 5");
		}
		else
		{
			System.out.println(num + " is not a Multiple of 5");
		}

	}

}
