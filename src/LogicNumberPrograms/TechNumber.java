package LogicNumberPrograms;

import java.util.Scanner;
class TechNumber 
{
	public static int count(int num)
	{
		int count =0;
		while (num!=0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	public static int divisor(int count)
	{
		int div = 1;
		for (int i = 1;i<=count/2 ;i++ )
		{
			div = div * 10;
		}
		return div;
	}
	public static boolean checkTechNumber(int num)
	{
		int count= count(num);
		if(count(num)%2==0)
		{
			int div = divisor(count);
			int half1 = num/div;
			int half2 = num%div;
			int sum = half1 + half2;
			int res = sum*sum;
			return res == num;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(checkTechNumber(num))
			System.out.println(num+" is a Tech number");
		else
			System.out.println(num+" is not a Tech number");

	}
}
