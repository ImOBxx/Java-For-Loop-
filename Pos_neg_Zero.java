package forloop;

import java.util.Scanner;

public class Pos_neg_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c_pos = 0;
		int c_neg = 0;
		int c_zero = 0;
		char choice;
		do 
		{
			System.out.println("Enter the Number: ");
			int number = in.nextInt();
			if (number < 0)
			{
				c_pos++;
			}
			else if (number < 0)
			{
				c_neg++;
			}
			else if (number < 0)
			{
				c_neg++;
			}
			else 
			{
				c_zero++;
			}
			System.out.println("Do you want to continue y/n? ");
			choice = in.next().charAt(0);
		}   while (choice == 'y' || choice == 'Y');
		System.out.println("Positive Numbers: " + c_pos);
        System.out.println("Negative Numbers: " + c_neg);
        System.out.println("Zero numbers: " + c_zero);
				}
			}
	
