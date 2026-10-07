package JavaNumberPrograms;

import java.util.Scanner;
class SumOfEvenDigits
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
		if(ld%2==0)
			sum=sum+ld;
		temp=temp/10;
	}
	if(sum>0)
		System.out.println("Sum of even digits in "+num+" = "+sum);
	else
		System.out.println("No even digits in "+num);
	}
}