package ifloop;

import java.util.Scanner;

public class Angles_of_a_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Three Angles of a Triangle: ");
		int angle1 = in.nextInt();
		int angle2 = in.nextInt();
		int angle3 = in.nextInt();
		int sum = angle1 + angle2 + angle3;
		if (sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
		{
			System.out.println("Triangle is Valid.");
		}
		else 
		{
			System.out.println("Triangle is not Valid.");
		}

	}

}
