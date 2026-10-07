package LogicNumberPrograms;

import java.util.Scanner;
class CheckEvilNumber 
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
	public static int count1s(int binary)
	{
		int count=0;
		while (binary!=0)
		{
		int ld = binary%10;
		if (ld == 1)
		{
			count++;
		}
		binary= binary/10;
		}
		return count;
	}
	public static boolean evilNumber(int num)
	{
		int binary=decimalToBinary(num);
		System.out.println("Binary form of "+num+" is "+binary);
		int count=count1s(binary);
		System.out.println("Count of 1s = "+count);
		
		return count%2==0;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (evilNumber(num))
		{
			System.out.println(num+" is an evil number");
		}
		else
			System.out.println(num+" is not an evil number");
	}
}
