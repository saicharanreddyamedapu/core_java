package Java_basic;

import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num:");
	int num = sc.nextInt();
	if(num<0)
	{
	  System.out.println(num + " is negative");
	} 
	else
	{
	  System.out.println(num + " is positive");
	}
	}
}