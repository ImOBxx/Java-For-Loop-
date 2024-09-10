package forloop;

import java.util.Scanner;

public class Digits_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Digits : ");
		int num = in.nextInt();
		int a = num;
		int rev = 0;
		int rem = 0;
		while (num > 0)
		{
			rem = num %  10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("\n");
		System.out.println("Given Digits : " + a);
		System.out.println("Reverse Digits : " + rev);
		
		}
		

	}


