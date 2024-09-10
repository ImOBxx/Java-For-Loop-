package ifloop;

import java.util.Scanner;

public class Max_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter First Number: ");
		num1 = in.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = in.nextInt();
		if (num1 > num2)
	
			System.out.println("The First Number is Greater.");
			
		
		else if (num2 > num1)
		
			System.out.println("The Second Number is Greater.");
		
		else 
		
			System.out.println("Both Numbers are Equal.");
		
			
		}
		
		
		

	}


