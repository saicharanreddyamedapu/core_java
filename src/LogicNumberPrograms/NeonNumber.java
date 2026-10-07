package LogicNumberPrograms;

import java.util.Scanner;
class NeonNumber 
{
	public static int sumOfDigits(int num)
	{
		int sum = 0; 
		while (num!=0)
		{
			int ld = num%10;
			sum = sum+ld;
			num = num/10;
		}
		return sum;
	}
	public static boolean checkNeon(int num)
	{
		int sqnum = num*num;
		int sum = sumOfDigits(sqnum);
		return sum ==num;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(checkNeon(num))
			System.out.println(num+" is a Neon number");
		else
			System.out.println(num+" is not a Neon number");
	}
}
