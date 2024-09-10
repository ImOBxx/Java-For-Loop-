package ifloop;

import java.util.Scanner;

public class Employee_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    double hra;
		double bs, da;
		double sum = 0;
	    System.out.println("Input Salary: ");
	    bs = in.nextDouble();
	    if (bs <= 1500)
	    {
	    	hra = (10 / 100.0) * bs;
	    	da = (90 / 100.0) * bs;
	    	sum = bs + hra + da;
	    	
	    }
	    else if (bs >= 1500)
	    {
	    	hra = 500;
	    	da = (98 / 100.0) * bs;
	    	sum = hra + da + bs;
	    	
	    }
	    System.out.println("Your Gross Salary: " + sum);

	}

}
