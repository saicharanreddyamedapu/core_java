package JavaNumberPrograms;

import java.util.Scanner;
class  SumOfFactorialOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			int fact=1;
			for (int i=1;i<=ld ;i++ )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println("The sum of the factorial of digits in "+temp+" is "+sum);
	}
}
