package ifloop;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Enter Number: ");
		num = in.nextInt();
		if (num % 2 == 0)
		System.out.println("The Given Number is EVEN");
		else 
        System.out.println("The Given Number is ODD");
		
	}

}

