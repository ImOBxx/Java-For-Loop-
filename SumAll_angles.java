package ifloop;

import java.util.Scanner;

public class SumAll_angles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Triangle Side 1: ");
		int s1 = in.nextInt();
		System.out.println("Enter Triangle Side 2: ");
		int s2 = in.nextInt();
		System.out.println("Enter Triangle Side 3: ");
		int s3 = in.nextInt();
		int sum =  s1 + s2 + s3;
		if (sum == 180)
		{
			System.out.println("Triangle is Valid.");
		}
		else 
		{
			System.out.println("Triangle is not Valid.");
		}
		

	}

}
