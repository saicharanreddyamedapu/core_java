package Java_basic;

import java.util.Scanner;
class First_n_CubeNum
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the n value");
	int n=sc.nextInt();
	System.out.println("The first "+n+" cube numbers:");
	int i =1;
	while(i<=n)
	{
	System.out.println(i*i*i);
	i++;
	}
	}
}