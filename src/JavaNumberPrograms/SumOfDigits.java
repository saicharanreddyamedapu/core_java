package JavaNumberPrograms;

import java.util.Scanner;
class SumOfDigits
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	int temp=num;
	while(temp>0)
	{
		int ld=temp%10;
		sum=sum+ld;
		temp=temp/10;
	}
	System.out.println("The sum of digits of "+num+" is "+sum);
	}
}