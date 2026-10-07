package JavaNumberPrograms;

import java.util.Scanner;
class SumOfExpoValueOfEachDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int count=0;
		int sum=0;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;
		System.out.println("Number of digits = "+count);
		while (num>0)
		{
			int exp=1;
			int ld = num%10;
			for (int i = 1;i<=count ;i++ )
			{
				exp = exp*ld;
			}
			num=num/10;
			sum = sum+exp;
		}
		System.out.println("Sum of exponential value of each digit to the power of total no of digits in "+temp+" = "+sum);
	}
}