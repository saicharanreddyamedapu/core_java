package LogicNumberPrograms;

import java.util.Scanner;
class NextPrimeNumber 
{

	public static boolean checkPrime(int num) 
	{
		int count=0;
		for (int i = 1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
			return count==2;
	}

	public static int nextPrimeNumber(int num) 
	{
		for (int i= num+1; ;i++ )
		{
			if (checkPrime(i))
			{
				return i;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int nextPrime = nextPrimeNumber(num);
		System.out.println("Next prime number is "+nextPrime);
	}
}
