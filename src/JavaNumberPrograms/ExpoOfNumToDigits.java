package JavaNumberPrograms;

import java.util.Scanner;
class ExpoOfNumToDigits
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
			num=num/10;
			count++;
		}
		System.out.println("Number of digits = "+count);
		int exp=1;
		for (int i=1;i<=count ;i++ )
		{
			exp=exp*temp;
		}
		System.out.println("Exponential value of "+temp+" is "+exp);
		
	}
}
