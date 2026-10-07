package LogicNumberPrograms;

import java.util.Scanner;
class FibonacciSeries
{
	public static void nFibonacci(int n)
	{
		int a =0;
		int b=1;
		System.out.println("The first "+n+" terms of Fibonacci Series");
		for (int i=1;i<=n ;i++ )
		{
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value for fibonacci series");
		int n = sc.nextInt();
		nFibonacci(n);
	}
}
