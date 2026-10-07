package JavaNumberPrograms;

import java.util.Scanner;
class SumOfOddNumbers
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the start value");
	int m=sc.nextInt();
	System.out.println("Enter the end value");
	int n=sc.nextInt();
	int sum=0;
	for(int i=m;i<=n;i++)
	{
		if(i%2==1)
		{
		sum=sum+i;
		}
	}
	System.out.println("The sum of the odd numbers in range of " + m+","+n+" is "+sum);
	}
}