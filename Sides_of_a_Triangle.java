package ifloop;

import java.util.Scanner;

public class Sides_of_a_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		if((side1 + side2) > side3)
			if((side2 + side3) > side1)
				if((side1 + side3) > side2) 
					System.out.println("Triangle is valid.");
				else
					System.out.println("Triangle is not valid.");
			else
				System.out.println("Triangle is not valid.");
		else
			System.out.println("Triangle is not valid.");
	}


	}


