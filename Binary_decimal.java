package forloop;

import java.util.Scanner;

public class Binary_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Binary Number: ");
		int n = in.nextInt();
		int n1, p = 1;
		int dec = 0; 
		int i = 1, j, d;
		n1 = n;
		for (j = n; j > 0; j = j / 10)
		{
			d = j % 10;
			if (i == 1)
				p = p * 1;
			else 
				p = p * 2;
			dec = dec + (d * p);
			i++;
		}
		System.out.println("\n");
		System.out.println("Binary Number : " + n1);
		System.out.println("Decimal Number : " + dec);
		}
		

	}


