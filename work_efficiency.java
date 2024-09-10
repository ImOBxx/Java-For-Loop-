package ifloop;

import java.util.Scanner;

public class work_efficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Time taken by Worker : ");
		float hrs = in.nextFloat();
		if (hrs >= 2 && hrs<= 3)
		{
			System.out.println("Worker is Highly Efficient");
			
		}
		else if (hrs > 3 && hrs <= 4)
		{
			System.out.println("Worker Needs to Improve Speed");
		}
		else if (hrs > 4 && hrs <= 5)
		{
			System.out.println("Give Training to Worker");
		}
		else 
		{
			System.out.println("Worker Has To Leave The Company");
		}
	}

}
