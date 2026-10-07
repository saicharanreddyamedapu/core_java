package JavaNumberPrograms;

import java.util.Scanner;
class ProductOfEvenDigits
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
		if(ld%2==0)
			prod=prod*ld;
		temp=temp/10;
	}
	if(prod==1)
		System.out.println("No Even digits in "+num);
	else
		System.out.println("Product of even digits in "+num+" = "+prod);
	}
}