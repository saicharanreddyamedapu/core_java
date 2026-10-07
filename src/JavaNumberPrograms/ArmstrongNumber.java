package JavaNumberPrograms;

import java.util.Scanner;
class ArmstrongNumber 
{

	public static int count(int num) 
	{
		int count = 0;
		while (num!=0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	
	public static int exponential(int num, int count) 
	{
		int exp = 1;
		for (int i = 1;i<=count ;i++ )
		{
			exp = exp*num;
		}
		return exp;
	}
	public static boolean checkArmStrong(int num) 
	{
		int temp = num;
		int count = count(num);
		int sum = 0;
		while (num!=0)
		{
			int ld = num%10;
			int exp = exponential(ld,count);
			sum = sum+exp;
			num = num/10;
		}
		return temp==sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if (checkArmStrong(num))
			System.out.println(num +" is an armstrong number");
		else
			System.out.println(num +" is not an armstrong number");
		
	}
}
