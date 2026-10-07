package LogicNumberPrograms;

import java.util.Scanner;
class LargestDigitOfNumber 
{
	public static int largest(int num)
	{
		int largest = 0;
		while (num!=0)
		{
			int ld = num%10;
			if (ld >= largest)
			{
				largest = ld;
			}
			num = num/10;
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int large = largest(num);
		System.out.println(large+" is the largest digit in "+num);
	}
}
