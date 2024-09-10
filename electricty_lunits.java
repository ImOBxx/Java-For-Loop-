package ifloop;

import java.util.Scanner;

public class electricty_lunits {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the number of electricity units consumed: ");
		        int units = scanner.nextInt();
		        
		        double totalBill = calculateBill(units);
		        
		        System.out.println("Total electricity bill: Rs. " + totalBill);
		        
		        scanner.close();
		    }
		    
		    public static double calculateBill(int units) {
		        double totalBill = 0;
		        
		        if (units <= 50) {
		            totalBill = units * 0.50;
		        } else if (units <= 200) {
		            totalBill = 50 * 0.50 + (units - 50) * 0.75;
		        } else if (units <= 450) {
		            totalBill = 50 * 0.50 + 150 * 0.75 + (units - 200) * 1.20;
		        } else {
		            totalBill = 50 * 0.50 + 150 * 0.75 + 250 * 1.20 + (units - 450) * 1.50;
		        }
		        
		        double surcharge = totalBill * 0.20;
		        totalBill += surcharge;
		        
		        return totalBill;
		    }
		}

	
