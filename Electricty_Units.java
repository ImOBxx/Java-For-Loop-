package ifloop;

import java.util.Scanner;

public class Electricty_Units {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float U, M, surcharge, bill_amt;
		System.out.println("Input Electricity Units: ");
		U = in.nextFloat();
		if (U <= 50)
		{
			M = (float) (U * 0.50);
		}
		else if (U <= 150)
		{
			M = (float) (U * 0.75); 
		}
		else if (U <= 250)
			
		{
			M = (float) (U * 1.20);
		}
		else 
		{
			M = (float) (U * 1.50);
		}
		surcharge = M * 0.2f;
		bill_amt = M + surcharge;
		System.out.println("Total electricity Bill: " + bill_amt);

	}

}
