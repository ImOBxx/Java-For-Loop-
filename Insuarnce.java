package ifloop;

import java.util.Scanner;

public class Insuarnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int age;
		char gen;
		char status;
		System.out.println("Enter Sex of the Employee (M / F): ");
		gen = in.next().charAt(0);
		System.out.println("Enter Age of The Employee: ");
		age = in.nextInt();
		System.out.println("Enter Marital Status of the Employee (M / U): ");
		status = in.next().charAt(0);
		
		if (status == 'M' || status == 'm')
		{
			System.out.println("Driver Should be Insured.");
		}
		else if (status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
		{
		    System.out.println("Driver should be insured.");
			
		}
		else if (status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
			
		{
			System.out.println("Driver should be insured.");
		}
		else 
		{
			System.out.println("Driver should not be Insured");
			
		}
		
		
		
		
		

	}

}
