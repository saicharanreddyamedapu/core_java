package LogicNumberPrograms;

import java.util.Scanner;
class EvilNumber 
{
	public static int count(int num)
	{
		int bin = 0;
		//int place = 1;
		int count=0;
		while (num!=0)
		{
			int rem = num%2;
			if (rem==1)
			{
				count++;
			}
			//bin = bin + (rem*place);
			//place = place *10;
			num=num/2;
		}
		return count;
	}
	public static void evilNumber(int num)
	{
		int count=count(num);
		if (count%2==0)
			System.out.println(num+" is an evil number");
		else
			System.out.println(num+" is not an evil number");
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		evilNumber(num);
	}
}
