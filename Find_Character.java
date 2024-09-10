package ifloop;

import java.util.Scanner;

public class Find_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Value: ");
		char ch = in.next().charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
		{
			System.out.println("This is a Alphabet.");
		}
		else if (ch >= '0' && ch <= '9')
		{
			System.out.println("This is a Number.");
		}
		else 
		{
			System.out.println("This is Special Character");
		}
	}

}
