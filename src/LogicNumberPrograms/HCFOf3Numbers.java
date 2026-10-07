package LogicNumberPrograms;

import java.util.Scanner;
class HCFOf3Numbers 
{
	public static int smallest(int n1,int n2,int n3)
	{
		int smallest=(n1<n2 && n1<n3)? n1:(n2<n1 && n2<n3)?  n2: n3;
		return smallest;
	}
	public static int hcfOf3Numbers(int n1,int n2,int n3)
	{
		int smallest = smallest(n1,n2,n3);
		int hcf = 0;
		for (int i=1;i<=smallest ;i++ )
		{
			if (n1%i==0 && n2%i==0 && n3%i==0 )
			{
			hcf=i;
			}
		}
		return hcf;
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
		int hcf = hcfOf3Numbers(n1,n2,n3);
		System.out.println("HCF of "+n1+","+n2+","+n3+" = "+hcf);
	}
}
