package Java_basic;

import java.util.Scanner;
class First_n_Natural_Reverse
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nth natural number");
	int n = sc.nextInt();
	int i=n;
	System.out.println("The first "+" natural numbers in reverse order:");
	while(i>=1)
	{
	System.out.println(i);
	i--;
	}
	}
}