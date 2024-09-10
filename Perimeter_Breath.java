package ifloop;

import java.util.Scanner;

public class Perimeter_Breath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		float len = in.nextFloat();
		System.out.println("Enter the Breadth: ");
		float bre = in.nextFloat();
		float area = len * bre;
		float perimeter = 2 * (len + bre);
		System.out.println("Area of Rectangle: " + area);
		System.out.println("Perimeter of a Rectangle: " + perimeter);
		if (area > perimeter)
		{
			System.out.println("Area of rectangle is greater than Perimeter");
		}
		else 
		{
			System.out.println("Perimeter of the rectangle is greater than the area");
		}
			
	}

}
