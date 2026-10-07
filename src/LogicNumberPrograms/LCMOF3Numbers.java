package LogicNumberPrograms;

import java.util.Scanner;
class LCMOF3Numbers
{
	public static int smallest(int a,int b)
	{
		int small = (a<b)?a: b;
		return small;
	}
	public static int hcfOf2Numbers(int a,int b)
	{
		int smallest = smallest(a,b);
		int hcf =0;
		for (int i=1;i<=smallest ;i++ )
		{
			if (a%i==0 && b%i==0)
			{
				hcf = i;
			}
		}
		return hcf;
	}
	public static int lcmOf2Numbers(int a, int b)
	{
		int hcf = hcfOf2Numbers(a,b);
		int lcm = (a*b)/hcf;
		return lcm;
	}
	/*public static int lcmOf3Numbers(int a, int b,int c)
	{
		int lcmOf2 = lcmOf2Numbers(a,b);
		int lcmOf3 = lcmOf2Numbers(lcmOf2,c);
		return lcmOf3;
	}*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
		System.out.println("Enter number 3");
		int n3 = sc.nextInt();
		//int lcm = lcmOf3Numbers(n1,n2,n3);
		int lcm2=lcmOf2Numbers(n1,n2);
		int lcm=lcmOf2Numbers(lcm2,n3);
		System.out.println("LCM of "+n1+","+n2+","+n3+"="+lcm);
	}
}
