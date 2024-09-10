package forloop;

public class Tables24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 24;
	    int y = 50; 
	    int z = 29; 
	    int sum = 0;
		int i;
		for (i = 1; i <= 10; i++)
		{
			sum = x * i;
			System.out.println(x + " x " + i + " = " + sum);
		}
		System.out.println("\n");
		for (i = 1; i <= 10; i++)
		{
			sum = y * i;
			System.out.println(y + " x " + i + " = " + sum);
		}
		System.out.println("\n");
		for (i = 1; i <= 10; i++)
		{
			sum = z * i;
			System.out.println(z + " x " + i + " = " + sum);
		}
		System.out.println("\n");


	}

}
