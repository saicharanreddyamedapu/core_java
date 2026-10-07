package MediumLevelNumberPrograms;

import java.util.Scanner;
class SumOfPowerOfDigitToDigits
{
	
	public static int count(int num) 
	{
		int count = 0;
		while (num!=0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	
	public static int exponential(int num,int count)
	{
		int exp = 1;
		for (int i =1;i<=count;i++ )
		{
			exp = exp*num;
		}
		return exp;
	}

	public static int sumOfPowerOfDigitToDigits(int num) 
	{
		int count = count(num);
		int sum =0;
		int temp = num;
		while (temp!=0)
		{
			int ld = temp%10;
			int exp = exponential(ld,count);
			sum = sum +exp;
			temp = temp/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = sumOfPowerOfDigitToDigits(num);
		System.out.println("Sum Of Power Of each Digit To total number of Digits in "+num+" is " +sum);
	}
}
