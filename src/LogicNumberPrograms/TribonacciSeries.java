package LogicNumberPrograms;

import java.util.Scanner;
class TribonacciSeries 
{
	public static void nTribonacci(int n)
	{
		int a=0;
		int b=1;
		int c=1;
		System.out.println("The first "+n+"terms of the tribonacci Series:");
		for (int i =1;i<=n;i++ )
		{
			System.out.print(a+" ");
			int d = a+b+c;
			a=b;
			b=c;
			c=d;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n= sc.nextInt();
		nTribonacci(n);
	}
}
