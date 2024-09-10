package forloop;

import java.util.Scanner;

public class Decimal_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal, i = 0;
		int[] binary = new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Decimal Number: ");
		decimal = scan.nextInt();
		while(decimal != 0)
		{
			binary[i] = decimal % 2;
			i++;
			decimal = decimal / 2;
		}
		System.out.print("Binary Number : ");
		for (i = (i - 1); i > 0; i--)
			System.out.println(binary[i]);
		}

	}


