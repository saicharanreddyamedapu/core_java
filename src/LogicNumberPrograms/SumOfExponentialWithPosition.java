package LogicNumberPrograms;

import java.util.Scanner;
class SumOfExponentialWithPosition 
{
	public static int count(int num)
	{
		int count = 0;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	public static int exponential(int num,int power)
	{
		int exp = 1;
		for (int i=1;i<=power ;i++)
		{
			exp = exp*num;			
		}
		return exp;
	}
	public static int SumOfExponential(int num)
	{
		int count = count(num);
		int sum =0;
		while(num!=0)
		{
			int ld = num%10;
			int exp = exponential(ld,count);
			count--;
			sum = sum + exp;
			num =num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = SumOfExponential(num);
		System.out.println("Sum of Exponential to the positions of "+num+" is "+sum);
	}
}
