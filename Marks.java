package ifloop;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double s1, s2, s3, s4, s5;
		double per;
		System.out.println("Marks of Subject 1: ");
		s1 = in.nextDouble();
		System.out.println("Marks of Subject 2: ");
		s2 = in.nextDouble();
		System.out.println("Marks of Subject 3: ");
		s3 = in.nextDouble();
		System.out.println("Marks of Subject 4: ");
		s4 = in.nextDouble();
		System.out.println("Marks of Subject 5: ");
		s5 = in.nextDouble();
		per = ((s1 + s2 + s3 + s4 + s5) / 500.0) * 100;
		System.out.println("\n");
		System.out.println("Your Percentage: " + per + "%");
		
		if (per >= 60)
		{
			System.out.println("First Divison.");
		}
		else if (per >= 50 && per <= 59)
		{
			System.out.println("Second Division.");
		}
		else if (per >= 40 && per <= 49)
		{
			System.out.println("Third Divsion.");
		}
		else 
		{
			System.out.println("Fail.");
		}
		

	}

}
