package forloop;

import java.util.Scanner;

public class Exercise1Natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int s = in.nextInt();
		System.out.println("Enter the Ending number: ");
		int e = in.nextInt();
		System.out.println("\n");
		System.out.println("Values: ");
		while(s<=e)
		{
			System.out.println(s);
			s++;
		}
		

	}

}
