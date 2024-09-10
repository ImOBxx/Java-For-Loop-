package ifloop;

import java.util.Scanner;

public class Absolute_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = in.nextInt();
		if (num < 0)
			num = (-1) * num;
		System.out.println("Absolute Number is : " + num);

	}

}
