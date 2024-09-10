package forloop;

import java.util.Scanner;

public class Binary_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin, i = 1, j;
		int oct[] = new int[100];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Binary Number : ");
		bin = in.nextInt();
		while (bin != 0)
		{
			oct[i++] = bin % 8;
			bin = bin / 8;
		}
		System.out.println("Octal number : ");
		for (j = i - 1; j > 0; j--)
		{
			System.out.println(oct[j]);
		}

	}

}
