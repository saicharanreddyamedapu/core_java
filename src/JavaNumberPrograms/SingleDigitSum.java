package JavaNumberPrograms;

import java.util.Scanner;
class SingleDigitSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		while (num>9)
		{
			int sum=0;
			while (num>0)
			{
				int ld=num%10;
				sum=sum+ld;
				num=num/10;
			}
			num=sum;
		}
		System.out.println("Single Digit Sum of "+temp+" = "+num);
	}
}
