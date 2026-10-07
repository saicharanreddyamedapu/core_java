package LogicNumberPrograms;

import java.util.Scanner;
class PerfectNumber 
{
	
	public static boolean perfectNumber(int num)
	{
		int sum =0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				sum =sum +i;
			}
		}
		return sum==num;		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		if (perfectNumber(num))
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
	}
}
