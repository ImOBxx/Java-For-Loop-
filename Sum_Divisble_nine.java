package forloop;

public class Sum_Divisble_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		System.out.println("Numbers bwetween 100 and 200, divisible by 9 : \n");
		for (i = 101; i < 200; i++)
		{
			if (i % 9 == 0)
			{
				System.out.println(i);
				sum += i;
			}
		}

	}

}
