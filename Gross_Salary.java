package ifloop;

import java.util.Scanner;

public class Gross_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double B, HRA, DA, SUM = 0;
		
		
		System.out.println("Input Basic Salary: ");
		B = in.nextDouble();
		if (B <= 10000) {
			HRA = (20 / 100.0) * B;
			DA = (80 / 100.0) * B;
			SUM = (HRA + DA + B);
		}
		else if (B <= 20000 && B >=10000) {
			HRA = (25 / 100.0) * B;
			DA = (90 / 100.0) * B;
			SUM = (HRA + DA + B);
		}
	
		else if (B > 20000)
		{
			HRA = (30 / 100.0) * B;
			DA = (95 / 100.0) * B;
			SUM = (HRA + DA + B);
		}
		System.out.println("Your Basic Pay along with Allowances: " + SUM + "$");
		
			
			
		
		}

	}


