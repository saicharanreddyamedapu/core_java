package LogicNumberPrograms;

import java.util.Scanner;
class StrongNumber 
{
	public static int factorial(int ld)
	{
		int fact=1;
		for (int i = 1 ;i<=ld ;i++ )
		{
			fact = fact *i;
		}
		return fact;
	}
	public static int SumOfFactorial(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int ld = num%10;
			int fact=factorial(ld);
			sum = sum+fact;
			num=num/10;
		}
		return sum;
	}
	public static boolean Strong(int num)
	{
		int sum = SumOfFactorial(num);
		return sum==num;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(Strong(num))
			System.out.println(num +" is a Strong number");
		else
			System.out.println(num +" is not a Strong number");
	}
}
