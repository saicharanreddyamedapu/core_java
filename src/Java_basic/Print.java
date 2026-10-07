package Java_basic;

import java.util.Scanner;
class Print
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.next();
	System.out.println("How many times to print??");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	System.out.println(name);
	}
	}																		
}