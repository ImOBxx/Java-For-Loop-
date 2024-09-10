package ifloop;

import java.util.Scanner;

public class div5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Enter Number: ");
		num = in.nextInt();
		if (num % 5 == 0 && num % 11 == 0)
			System.out.println("The Entered Number is Divisible by 5 & 11");
		else 
			System.out.println("The Number is not Divisible");

	}

}
