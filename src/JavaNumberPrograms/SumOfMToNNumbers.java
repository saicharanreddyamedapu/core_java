package JavaNumberPrograms;

/* WAP to find the sum of numbers in the range of m to n */
import java.util.Scanner;
class SumOfMToNNumbers
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value");
		int m=sc.nextInt();
		System.out.println("Enter the end value");
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of numbers in range "+m+" to "+n+" is " +sum);
	}
}