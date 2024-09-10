package ifloop;

import java.util.Scanner;

public class Discunted_Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Quantity Purchased: ");
		int qty = in.nextInt();
		System.out.println("Enter the Amount Per Item: ");
		float amt = in.nextFloat();
		float exp;
		if (qty > 100)
		{
			exp = qty * amt;
			exp = exp - (exp * 0.1f);
		}
		else {
			exp = qty * amt;
		}
		System.out.println("Total Expense is: " + exp);
		}

	}


