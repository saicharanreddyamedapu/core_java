package LogicNumberPrograms;

import java.util.Scanner;
class SmallestDigitOfNumber 
{

	public static int smallest(int num)
	{
		int smallest = 9;
		while (num!=0)
		{
			int ld = num%10;
			if (ld <= smallest)
			{
				smallest = ld;
			}
			num = num/10;
		}
		return smallest;
	}

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int small = smallest(num);
		System.out.println(small+" is the smallest digit in "+num);
	}
}
