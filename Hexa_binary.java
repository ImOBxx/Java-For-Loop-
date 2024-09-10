package forloop;

import java.util.Scanner;

public class Hexa_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HexatoBinary obj = new HexatoBinary();
		obj.getVal();
		obj.convert();
	}
	
}
class HexatoBinary
{
	int hex;
	void getVal()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Hexadecimal Number : ");
		hex = Integer.parseInt(in.nextLine(), 16);
	}
	void convert()
	{
		String bin = Integer.toBinaryString(hex);
		System.out.println("Binary Number : " + bin);


	}

}
