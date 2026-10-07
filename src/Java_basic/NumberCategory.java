package Java_basic;

import java.util.Scanner;
class NumberCategory
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	if(num>0)
	{
	System.out.println(num+ " is Positive number");
	}
	else if(num<0)
	{
	System.out.println(num + " is negative number");
	}
	else
	{
	System.out.println(num + " is zero");
	}
	}
}