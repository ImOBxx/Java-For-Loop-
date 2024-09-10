package ifloop;

import java.util.Scanner;

public class Calculate_Marks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int P, C, M, B, T;
		System.out.println("Input Marks of Physics: ");
		P = in.nextInt();
		System.out.println("Input Marks of Chemistry: ");
		C = in.nextInt();
		System.out.println("Input Marks of Maths: ");
		M = in.nextInt();
		System.out.println("Input Marks of Biology: ");
		B = in.nextInt();
		System.out.println("Input Marks of Computers: ");
		T = in.nextInt();
		double percentage = ((P + C + M + B + T) / 500.0) * 100;
		System.out.println("Your Percentage: " + percentage + "%");
		
		if (percentage >= 90)
		System.out.println("Grade A");
		else if (percentage >= 80 && percentage <= 90)
			System.out.println("Grade B");
		else if (percentage >= 70 && percentage <= 80)
			System.out.println("Grade C");
		else if (percentage >= 60 && percentage <= 70)
			System.out.println("Grade D");
		else if (percentage >= 40 && percentage <= 60)
			System.out.println("Grade E");
		else 
			System.out.println("Grade F");
	
		
		
	}

}
