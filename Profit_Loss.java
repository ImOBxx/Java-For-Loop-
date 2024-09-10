package ifloop;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Cost Price : ");
		int cp = in.nextInt();
		System.out.println("Enter the Selling Price : ");
		int sp = in.nextInt();
		int p, l;
		if (sp > cp)
		{
			p = sp - cp;
			System.out.println("Profit : " + p);
		}
		else if (sp > cp)
		{
			l = cp - sp;
			System.out.println("Loss : + l");
		}
		else 
		{
			System.out.println("No Profit  No loss");
			
		}

	}

}
