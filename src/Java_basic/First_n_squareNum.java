package Java_basic;

import java.util.Scanner;
class First_n_SquareNum
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nth natural number");
	int n = sc.nextInt();
	int i=1;
	System.out.println("The first "+n+" square numbers:");
	while(i<=n)
	{
	System.out.println(i*i);
	i++;
	}
	}
}