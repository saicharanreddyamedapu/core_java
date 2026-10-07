package Java_basic;

import java.util.Scanner;
class MultiplicationOfN
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	int res=i*n;
	System.out.println(n + " * " + i + " = " + res);
	}
	}
}