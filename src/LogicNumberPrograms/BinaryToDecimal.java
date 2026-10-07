package LogicNumberPrograms;

import java.util.Scanner;
class BinaryToDecimal 
{
	public static int binarytodecimal(int binary)
	{
		int dec=0;
		int exp=1;
		while (binary!=0)
		{
			int ld = binary%10;
			if (ld==1)
			{
				dec = dec +exp;
			}
			exp = exp*2;
			binary=binary/10;
		}
		return dec;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		int binary=sc.nextInt();
		int decimal=binarytodecimal(binary);
		System.out.println("Decimal form of "+binary+" is "+decimal);
	}
}
