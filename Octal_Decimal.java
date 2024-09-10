package forloop;

import java.util.Scanner;

public class Octal_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long oct, dec = 0;
        int i = 0;
        System.out.println("Enter The Octal Number: ");
        oct = in.nextLong();
        System.out.println("Octal Number: " + oct);
        while (oct != 0)
        {
        	dec = (long) ((dec + (oct % 10)) * Math.pow(8, i++));
        	oct = oct / 10;
        }
        System.out.println("Decimal Number: " + dec);
        }
	}

