package forloop;

import java.util.Scanner;

public class Reverse_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Starting number: ");
		int s = in.nextInt();
		System.out.println("Enter the Ending number: ");
		int e  = in.nextInt();
		while (s>=e)
		{ 
			System.out.println(s);
			s--;
		}
		
		

	}

}
