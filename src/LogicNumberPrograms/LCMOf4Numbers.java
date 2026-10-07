package LogicNumberPrograms;

import java.util.Scanner;
class LCMOf4Numbers 
{
	public static int smallest(int a,int b)
	{
		int small = (a<b)?a:b;
		return small;
	}
	public static int hcfOf2(int a,int b)
	{
		int smallest = smallest(a,b);
		int hcf=0;
		for (int i = 1;i<=smallest ;i++ )
		{
			if (a%i==0 && b%i==0)
			{
				hcf =i;
			}
		}
		return hcf;
	}
	public static int lcmOf2(int a,int b)
	{
		int hcf = hcfOf2(a,b);
		int lcm = (a*b)/hcf;
		return lcm;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
		System.out.println("Enter number 3");
		int n3 = sc.nextInt();
		System.out.println("Enter number 4");
		int n4 = sc.nextInt();
		int lcm3=lcmOf2(n1,n2);
		int lcm2=lcmOf2(lcm3,n3);
		int lcm=lcmOf2(lcm2,n4);
		System.out.println("LCM of "+n1+","+n2+","+n3+","+n4+" = "+lcm);
	}
}
