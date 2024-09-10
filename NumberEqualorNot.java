
package ifloop;

import java.util.Scanner;

public class NumberEqualorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n1, n2, n3;
		System.out.println("Enter Number 1: ");
		n1 = in.nextInt();
		System.out.println("Enter Number 2: ");
		n2 = in.nextInt();
		System.out.println("Enter Number 3: ");
		n3 =in.nextInt();
		if (n1 == n2 && n1 == n3 && n2 == n3)
		{
			System.out.println("All Numbers are equal");
			
		}
		else if ((n1 == n2) || (n1 == n3) || (n3 == n2))
		{
			System.out.println("Neither all are equal or Different");
		}
		else 
		{
			System.out.println("All Numbers are Different");
			
		}
	}

}
