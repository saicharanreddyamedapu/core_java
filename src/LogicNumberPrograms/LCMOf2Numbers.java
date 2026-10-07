package LogicNumberPrograms;

import java.util.Scanner;
class LCMOf2Numbers
{
	public static int smallest(int n1,int n2)
	{
		int smallest = (n1<n2)?n1:n2;
		return smallest;
	}
	public static int HCFOf2Numbers(int n1,int n2)
	{
		int smallest = smallest(n1,n2);
		int hcf=0;
		for (int i=1;i<=smallest ;i++ )
		{
			if (n1%i==0 && n2%i==0)
			{
			hcf=i;
			}
		}
		return hcf;
	}
	public static int lcmOf2Numbers(int n1,int n2)
	{
		int hcf=HCFOf2Numbers(n1,n2);
		int lcm = (n1*n2)/hcf;
		return lcm;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
		int lcm = lcmOf2Numbers(n1,n2);
		System.out.println("LCM of "+n1+","+n2+" = "+lcm);
	}
}
