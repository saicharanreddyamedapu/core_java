package JavaNumberPrograms;

import java.util.Scanner;
class SumOfPrimeDigits
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
		if(ld==2 || ld==3 || ld==5 || ld ==7)
			sum=sum+ld;
		temp=temp/10;
	}
	if(sum>0)
		System.out.println("Sum of Prime digits in "+num+" = "+sum);
	else
		System.out.println("No Prime digits in "+num);
	}
}  