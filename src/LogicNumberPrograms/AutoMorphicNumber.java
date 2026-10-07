package LogicNumberPrograms;

import java.util.Scanner;
class AutoMorphicNumber 
{
	public static int count(int num)
	{
		int count = 0;
		while (num!=0)
		{
			count++;
			num = num/10;
		}
		return  count;
	}
	public static int divisor(int count)
	{
		int div = 1;
		for (int i =1;i<=count ; i++)
		{
			div = div*10;
		}
		return div;
	}
	public static boolean checkAutoMorphic(int num)
	{
		int count = count(num);
		int div = divisor(count);
		int sqnum = num*num;
		int rem = sqnum % div;

		return rem==num;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(checkAutoMorphic(num))
			System.out.println(num+" is an automorphic number");
		else
			System.out.println(num+" is not an automorphic number");
	}
}
