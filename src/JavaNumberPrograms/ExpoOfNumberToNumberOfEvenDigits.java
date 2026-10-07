package JavaNumberPrograms;

import java.util.Scanner;
class ExpoOfNumberToNumberOfEvenDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp=num;
		int count=0;
		while (num>0)
		{
			int ld = num%10;
			if (ld%2==0)
			{
			count++;
			}
			num=num/10;
		}
		System.out.println("Number of even digits = "+count);
		if (count==0)
		{
			System.out.println("No even digits");
		}
		else
		{
		int exp=1;
		for (int i=1;i<=count ;i++ )
		{
			exp=exp*temp;
		}
		System.out.println("Exponential value of "+temp+" is "+exp);
		}
		
	}
}
