package forloop;

import java.util.Scanner;

public class Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of Limit : ");
		int l = in.nextInt();
		for (int s = 1; s <= l; s++)
		{
			if (s % 2 == 0)
				System.out.println(s);
				
		}

	}

}
