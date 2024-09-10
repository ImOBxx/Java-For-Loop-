package ifloop;

import java.util.Scanner;

public class Uppercase_Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = in.next().charAt(0);
		if (ch >= 'a' && ch >= 'b')
		{
			System.out.println("This is a Lowercase Alphabet");
		}
		else 
		{
			System.out.println("This is a Uppercase Alphabet");
		}

	}

}
