package forloop;

import java.util.Scanner;

public class Decimal_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Decimal Number : ");
		int dec = in.nextInt();
		System.out.println("Decimal Number : " + dec);
		int octal = convert_dec_oct(dec);
		System.out.println("Octal Number : " + octal);
	}
	public static int convert_dec_oct(int dec)
	{
		int octalNumber = 0, i = 1;
		while (dec != 0)
		{
			octalNumber += (dec % 8) * i;
			dec /= 8;
			i *= 10;
		}
		return octalNumber;
		}

	}


