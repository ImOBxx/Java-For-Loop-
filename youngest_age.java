package ifloop;

import java.util.Scanner;

public class youngest_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int r, s, a;
		System.out.println("Input Ram's Age:");
		r = in.nextInt();
		System.out.println("Input Shyam's Age: ");
		s = in.nextInt();
		System.out.println("Input Ajay's Age: ");
		a = in.nextInt();
		if (r < a && r < s)
		{
			System.out.println("Ram is the Youngest.");
		}
		else if (s < r && s < a)
		{
			System.out.println("Shyam is the Youngest.");
			
		}
		else 
		{
			System.out.println("Ajay is the Youngest.");
		}
	}

}
