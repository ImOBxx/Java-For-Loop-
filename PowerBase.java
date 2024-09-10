package forloop;

import java.util.Scanner;

public class PowerBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int b, p, r = 1;
		System.out.println("Enter The Base Number: ");
		b = in.nextInt();
		System.out.println("Enter The Power Number: ");
		p = in.nextInt();
		for (int i = 1; i <= p; i++)
		{
			r = r * b;
		}
		System.out.println("Result: " + r);
		

	}

}
