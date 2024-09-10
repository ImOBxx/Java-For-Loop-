package ifloop;

import java.util.Scanner;

public class Steel_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The value of Hardness :");
		float hs = input.nextFloat();
		System.out.print("Enter The value of Carbon Content :");
		float cc = input.nextFloat();
		System.out.print("Enter The value of Tensile Strength :");
		float ts = input.nextFloat();
		float hs_f=0,cc_f=0,ts_f=0,grade;
		if(hs>50) 
			hs_f=1;	
		if(cc<0.7) 
			cc_f=1;
		if(ts>5600) 
			ts_f=1;
		if(hs_f==0 && cc_f==0 && ts_f==0) 
			grade = 5;
		else if(hs_f==1 || cc_f==1 || ts==1) 
			grade = 6;
		else if(hs_f==1 && cc_f==0 && ts_f==1) 
			grade = 7;
		else if(hs_f==0 && cc_f==1 && ts_f==1)
			grade = 8;
		else if(hs_f==1 && cc_f==1 && ts_f==0) 
			grade = 9;
		else
			grade = 10;
		System.out.println("The Grade of Steel  :"+ grade);
 
		
}
}