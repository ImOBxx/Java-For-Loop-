package forloop;

public class octal_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oct = 14;
		System.out.println("Octal number : " + oct);
		int dec = 0, n = 0;
		while (oct > 0)
		{
			int temp = oct % 10;
			dec += temp * Math.pow(8, n);
			oct = oct / 10;
			n++;
		}
		int bin[] = new int[20];
		int i = 0;
		while (dec > 0)
		{
			int r = dec % 2;
			bin[i++] = r;
			dec = dec / 2;
		}
		System.out.println("Binary Number : ");
		for (int j = i - 1; j >= 0; j--)
			System.out.println(bin[j] + "");
		}

	
}
