package Java_basic;

import java.util.Scanner;
class FizzBuzzInRange
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the start value:");
	int m=sc.nextInt();
	System.out.println("Enter the end value:");
	int n=sc.nextInt();
	System.out.println("FizzBuzz numbers from" + m + "to" + n);
	for(int i=m;i<=n;i++)
	{
	if(i%3==0 && i%5==0)
		System.out.println(i + " - FizzBuzz");
	else if(i%3==0)
		System.out.println(i + " - Fizz");
	else if(i%5==0)
		System.out.println(i + " - Buzz");
	else
		System.out.println(i + " - Not a FizzBuzz");
	}
	}
}
