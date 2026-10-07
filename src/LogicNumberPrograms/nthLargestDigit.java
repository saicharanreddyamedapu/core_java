package LogicNumberPrograms;

import java.util.Scanner;
class nthLargestDigit 
{

	public static int nthLargest(int num, int n) 
	{
		int count = 0;
		for (int i = 9 ;i>=0 ;i-- )
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
		int nthLargest = nthLargest(num,n);
		if (nthLargest == -1)
		{
			System.out.println("Cannot find the nth Largest number for n = "+n);
		}
		else
			System.out.println(nthLargest+" is the nth Largest for n = "+n);

	}
}
