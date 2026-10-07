package JavaNumberPrograms;

/*WAP to find the product of the numbers in ranege of m to n*/
import java.util.Scanner;
class PorductOfNumbers
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
			prod=prod*i;
		}
		System.out.println("The product of numbers in range "+m+" to "+n+" is " +prod);

	}
}