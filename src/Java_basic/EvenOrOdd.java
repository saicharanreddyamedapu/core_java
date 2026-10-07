package Java_basic;

import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	if(num%2==0)
	{
	  System.out.println(num + " is Even");
	} 
	else
	{
	  System.out.println(num + " is Odd");
	}
	}
}