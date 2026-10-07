package JavaNumberPrograms;

import java.util.Scanner;
class  PowerOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the power value");
		int n=sc.nextInt();
		while(num>0)
		{
			int ld=num%10;
			int exp=1;
			for (int i=1;i<=n ;i++ )
			{
				exp=exp*ld;
			}
			System.out.println(ld+" power "+n+" is "+exp);
			num=num/10;
		}
	}
}
