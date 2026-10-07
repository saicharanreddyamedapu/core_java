package JavaNumberPrograms;

import java.util.Scanner;
class PorductOfEvenNumbers
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value");
		int m=sc.nextInt();
		System.out.println("Enter the end value");
		int n=sc.nextInt();
		int prod=1;
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			prod=prod*i;
		}
		System.out.println("The product of even numbers in range "+m+" to "+n+" is " +prod);

	}
}