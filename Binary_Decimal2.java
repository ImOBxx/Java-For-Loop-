package forloop;

import java.util.Scanner;

public class Binary_Decimal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long bin, dec = 0, i  = 1, rem;
		System.out.println("Enter The Binary Number: ");
		bin = in.nextLong();
		System.out.println("Binary Number: " + bin);
		while (bin != 0)
		{
			rem = bin % 10;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		System.out.println("Decimal Number: " + dec);
		}
		

	}


