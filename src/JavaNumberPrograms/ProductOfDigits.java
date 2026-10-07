package JavaNumberPrograms;

import java.util.Scanner;
class ProductOfDigits
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int prod=1;
	int temp=num;
	while(temp>0)
	{
		int ld=temp%10;
		prod=prod*ld;
		temp=temp/10;
	}
	System.out.println("Product of digits in "+num+" = "+prod);
	}
}