package LogicNumberPrograms;

import java.util.Scanner;
class DecimalToBinary 
{
	public static int decimalToBinary(int num)
	{
		int binary=0;
		int place=1;
		while (num!=0)
		{
			int rem = num%2;
			binary = binary + (rem *place);
			place = place *10;
			num=num/2;
		}
		return binary;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int binary = decimalToBinary(num);
		System.out.println("Binary number of "+num+" is "+binary);
	}
}
