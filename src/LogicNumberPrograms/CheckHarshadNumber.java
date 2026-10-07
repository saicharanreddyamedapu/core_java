package LogicNumberPrograms;

import java.util.Scanner;
class CheckHarshadNumber
{
	public static int sum(int num)
	{
		int sum = 0;
		while (num!=0)
		{
			int ld = num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	public static void checkHarshad(int num)
	{
		int sum= sum(num);
		if (num%sum==0)
		{
			System.out.println(num +" is a Harshad number");
		}
		else
			System.out.println(num +" is a Harshad number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		checkHarshad(num);
	}
}
