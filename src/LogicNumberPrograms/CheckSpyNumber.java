package LogicNumberPrograms;

import java.util.Scanner;
class CheckSpyNumber
{
	public static boolean checkSpyNumber(int num)
	{
		int sum = 0;
		int prod = 1;
		while (num>0)
		{
			int ld = num%10;
			sum=sum+ld;
			prod=prod*ld;
			num=num/10;
		}
		return sum==prod;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(checkSpyNumber(num))
			System.out.println(num+" is a SPY number");
		else
			System.out.println(num+" is not SPY number");
	}
}
