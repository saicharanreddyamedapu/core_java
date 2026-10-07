package MediumLevelNumberPrograms;

import java.util.Scanner;
class FactorialOfEvendigits 
{

	public static int factorial(int num) 
	{
		int fact =1 ;
		for (int i =1;i<=num ;i++ )
		{
			fact = fact*i;
		}
		return fact;
	}

	public static void evenFactorial(int num) 
	{
		int temp = num;
		while (num!=0)
		{
			int ld = num%10;
			if (ld%2==0)
			{
				int fact = factorial(ld);
				System.out.println("Factorial of "+ld+" is "+fact);
			}
			num = num/10;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		evenFactorial(num);
	}
}
