package LogicNumberPrograms;

import java.util.Scanner;
class NthPrimeNumber 
{

	public static boolean checkPrime(int num) 
	{
		int count = 0;
		for (int i =1;i<=num ;i++ )
		{
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static int nthPrime(int n) 
	{
		int count = 0;
		for (int i= 1; ;i++ )
		{
			if (checkPrime(i))
			{
				count++;
			}
			if (count==n)
			{
				return i;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int nthPrime = nthPrime(n);
		System.out.println("Nth Prime number for n = "+n+" is "+nthPrime);
	}
}
