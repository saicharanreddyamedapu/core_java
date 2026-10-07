package JavaNumberPrograms;

import java.util.Scanner;
class ExponentialValueOfEvenDigitToNumberOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int count=0;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;
		System.out.println("Number of digits = "+count);
		while (num>0)
		{
			int ld = num%10;
			if (ld%2==0)
			{
			int exp=1;
			for (int i = 1;i<=count ;i++ )
			{
				exp = exp*ld;
			}
			System.out.println("Exponential value of "+ld+" power of "+count+" = "+exp);
			}
			num=num/10;
		}
	}
}