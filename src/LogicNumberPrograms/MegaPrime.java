package LogicNumberPrograms;

import java.util.Scanner;
class MegaPrime 
{
	public static boolean checkPrime(int num)
	{
		int fact =0;
		for (int i =1 ;i<=num ;i++ )
		{
			if(num%i==0)
			fact++;
		}
		return fact==2;
	}
	public static boolean checkMegaPrime(int num)
	{
		if (checkPrime(num))
		{
			while (num!=0)
			{
				int ld = num%10;
				if(ld!=2 && ld!=3 && ld!=5 && ld!=7) 
					return false;
				num = num/10;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (checkMegaPrime(num))
			System.out.println(num+" is a mega prime Number");
		else
			System.out.println(num+" is not a mega prime Number");
		
	}
}
