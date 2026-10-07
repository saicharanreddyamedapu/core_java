package Java_basic;

import java.util.Scanner;
class MToNEvenNumber
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the start value:");
	int m = sc.nextInt();
	System.out.println("Enter the end value:");
	int n = sc.nextInt();
	System.out.println("Even numbers in range of " + m + "," + n + ":");
	for(int i=m;i<=n;i++)
	{
	if(i%2==0)
		System.out.println(i);
	}
	}
}