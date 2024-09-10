package forloop;

import java.util.Scanner;

public class Binary_Hexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0, bin;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Binary Number : ");
		bin = in.nextInt();
		System.out.println("Binary Number : " + bin);
		while (bin > 0)
		{
			rem = bin % 2;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		i = 0;
		while (dec != 0)
		{
			hex[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		System.out.println("HexaDecimal Number : ");
		for (j = i - 1; j >= 0; j--)
		{
			if (hex[j] > 9)
				System.out.println((char)(hex[j] + 55) + "\n");
				else 
					System.out.println(hex[j] + "\n");
				
		}
		
		

	}

}
