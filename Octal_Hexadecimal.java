package forloop;

import java.util.Scanner;

public class Octal_Hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oct, hex;
		int dec;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Octal number : ");
		oct = in.nextLine();
		dec = Integer.parseInt(oct, 8);
		hex = Integer.toHexString(dec);
		System.out.println("Hexadecimal Number: " + hex);

	}

}
