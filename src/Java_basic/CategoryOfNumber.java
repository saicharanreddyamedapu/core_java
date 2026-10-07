package Java_basic;

import java.util.Scanner;
class CategoryOfNumber
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	if(num>0 && num%2==0)
	{
	System.out.println(num+ " is positive even number");
	}
	else if(num>0 && num%2!=0)
	{
	System.out.println(num + " is positive odd number");
	}
	else if(num<0 && num%2==0)
	{
	System.out.println(num + " is negative even number");
	}
	else if(num<0 && num%2!=0)
	{
	System.out.println(num + " is negative odd number");
	}
	else
	{
	System.out.println(num + " is zero");
	}
	}
}