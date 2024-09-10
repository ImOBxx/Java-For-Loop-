package forloop;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int s = in.nextInt();
		System.out.println("Enter the ending number : ");
		int e = in.nextInt();
		System.out.println("Enter the tables number : ");
		int t = in.nextInt();
		System.out.println("\n");
		
		while (s <= e)
		{
			System.out.println(s + " * " + t + " = " + (s * t));
			s++;
			
			
		}
		
		
		
		

	}

}
