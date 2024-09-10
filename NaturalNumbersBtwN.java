package forloop;

import java.util.Scanner;

public class NaturalNumbersBtwN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n, i, sum = 0;
		System.out.println("Enter The Nth Term: ");
		n = in.nextInt();
		for (i = 1; i <= n; i++)
		{
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		

	}

}
