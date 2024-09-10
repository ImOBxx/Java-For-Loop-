package ifloop;

import java.util.Scanner;

public class PG_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char gen;
		int y;
		int qual;
		System.out.println("Enter Gender (M / F): ");
        gen = in.next().charAt(0);
        System.out.println("Enter The Years Of Service: ");
        y = in.nextInt();
        System.out.println("Enter Qualifiations (Graduate(0), Post- Graduate(1): ");
        qual = in.nextInt();
        int salary = 0;
        if (gen == 'm' && y >= 10 && qual == 1)
        {
        	salary = 15000;
        }
        else if ((gen == 'm' && y >= 10 && qual == 0) || (gen == 'm' && y <= 10 && qual == 1) || (gen == 'f' && y < 10 && qual == 1))
        {
        	salary = 10000;
        }
        else if (gen == 'm' && y < 10 && qual == 0)
        {
        	salary = 7000;
        }
        else if (gen == 'f' && y >= 10 && qual == 1)
        {
        	salary = 12000;
        }
        else if (gen == 'f' && y >= 10 && qual == 0)
        {
        	salary = 9000;
        }
	    else if (gen == 'f' && y < 10 && qual == 0)
	    {
	    	salary = 6000;
	    }
        System.out.println("Salary : " + salary);
	    	}
	    
	    	
	    }
        
	
	


