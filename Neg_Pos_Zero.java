package ifloop;

import java.util.Scanner;

public class Neg_Pos_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int num = in.nextInt();
		if (num > 0)
			System.out.println("\nPositive Number.");
		else if (num < 0)
			System.out.println("\nNegative Number.");
		else 
			System.out.println("\nZero.");

	}

}
