package Java_basic;

import java.util.Scanner;
class SumOf2Num
{
	public static void main(String [] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number1");
	 int n1=sc.nextInt();
	 System.out.println("Enter Number2");
	 int n2=sc.nextInt();
	 int sum=n1+n2;
	 System.out.println("Sum of " + n1 + " + " + n2 + " = " + sum);
	}
}