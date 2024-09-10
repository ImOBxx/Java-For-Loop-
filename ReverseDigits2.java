package forloop;

import java.util.Scanner;

public class ReverseDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, n, sum = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		while (n > 0);
		{
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		
		
		System.out.println("Reversed Digits: " + sum);
		}

	}

}
