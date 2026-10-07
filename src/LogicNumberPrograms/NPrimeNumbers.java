package LogicNumberPrograms;

import java.util.Scanner;
class NPrimeNumbers 
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

	public static void nPrimeNumbers(int n) 
	{
		int count = 0;
		for (int i= 1; ;i++ )
		{
			if (checkPrime(i))
			{
				System.out.print(i+" ");
				count++;
			}
			if (count == n)
			{
				break;
			}
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		nPrimeNumbers(n);
	}
}
