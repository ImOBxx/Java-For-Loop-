package ifloop;

import java.util.Scanner;

public class Max_3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Enter The First Number: ");
		num1 = in.nextInt();
		System.out.println("Enter The Second Number: ");
		num2 = in.nextInt();
		System.out.println("Enter The Third Number: ");
		num3 = in.nextInt();
		if (num1 > num2 && num1 > num3)
		System.out.println("The First Number is Greater. ");
		else if (num2 > num1 && num2 > num3)
		System.out.println("The Second Number is Greater. ");
		else if (num3 > num1 && num3 > num2)
		System.out.println("The Third Number is Greater. ");
		else 
			System.out.println("Both Numbers are Equal. ");
		
		
		

	}

}
