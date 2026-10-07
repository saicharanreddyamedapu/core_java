package LogicNumberPrograms;

import java.util.Scanner;
class nthSmallestDigit 
{

	public static int nthSmallest(int num, int n) 
	{
		int count = 0;
		for (int i = 0 ;i<=9 ;i++ )
		{
			int temp =num;
			while (temp!=0)
			{
				int ld = temp%10;
				if (ld ==i)
				{
					count++;
					break;
				}
				temp = temp/10;
			}
			if (count==n)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the nth largest");
		int n = sc.nextInt();
		int nthSmallest = nthSmallest(num,n);
		if (nthSmallest == -1)
		{
			System.out.println("Cannot find the nth Smallest number for n = "+n);
		}
		else
			System.out.println(nthSmallest+" is the nth Smallest for n = "+n);

	}
}
