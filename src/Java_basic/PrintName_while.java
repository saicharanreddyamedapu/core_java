package Java_basic;

import java.util.Scanner;
class PrintName_while
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.next();
	System.out.println("How many times to print");
	int n = sc.nextInt();
	int i=1;
	while(i<=n)
	{
	System.out.println(name);
	i++;
	}
	}
}