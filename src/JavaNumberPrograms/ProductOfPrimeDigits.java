package JavaNumberPrograms;

import java.util.Scanner;
class ProductOfPrimeDigits
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
		if(ld==2 || ld==3 || ld==5 || ld ==7)
			prod=prod*+ld;
		temp=temp/10;
	}
	if(prod>1)
		System.out.println("Product of Prime digits in "+num+" = "+prod);
	else
		System.out.println("No Prime digits in "+num);
	}
}  