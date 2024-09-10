package ifloop;

import java.util.Scanner;

public class Checj_Incre_Decre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner in = new Scanner(System.in);
			System.out.print("Input First number: ");
			double num1 = in.nextDouble();
			System.out.print("Input Second number: ");
			double num2 = in.nextDouble();
			System.out.print("Input Third number: ");
			double num3 = in.nextDouble();
			if (num1 < num2 && num2 < num3)
			{
				System.out.println("Numbers are in Increasing Order");
			}
			else if (num1 > num2 && num2 > num3)
			{
				System.out.println("Numbers are in Decreasing Order");
			}
			else
			{
				System.out.println("Neither Increasing or Decreasing Order");
	        }
	    }

	}


