package ifloop;

import java.util.Scanner;

public class Check_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Three Sides Of A Triangle: ");
		int side1 = in.nextInt();
		int side2 = in.nextInt();
		int side3 = in.nextInt();
		if (side1 == side2 && side2 == side3)
			System.out.println("Equialteral Triangle.");
		else if (side1 == side2 && side2 == side3)
			System.out.println("Isoceles Triangel.");
		else
			System.out.println("Scalene Triangle.");
		
		

	}

}
