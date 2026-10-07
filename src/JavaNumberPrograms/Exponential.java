package JavaNumberPrograms;

import java.util.Scanner;
class Exponential
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value");
		int x = sc.nextInt();
		System.out.println("Enter the power value");
		int n = sc.nextInt();
		int exp=1;
		for (int i=1;i<=n ;i++ )
		{
			exp=exp*x;
		}
		System.out.println("The exponential value is "+exp);
	}
}
