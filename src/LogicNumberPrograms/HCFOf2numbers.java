package LogicNumberPrograms;

import java.util.Scanner;
class HCFOf2numbers 
{
	public static int smallest(int n1,int n2)
	{
		if(n1<=n2)
			return n1;
		else
			return n2;
	}
	public static int HCFOf2Num(int n1,int n2)
	{
		int smallest = smallest(n1,n2);
		int hcf =0;
		for (int i=smallest;i>=1 ;i-- )
		{
			if (n1%i==0 && n2%i==0)
			{
			hcf = i;
			break;
			}
		}
		return hcf;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int n1 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int n2 = sc.nextInt();
		int hcf=HCFOf2Num(n1,n2);
		System.out.println("The HCF of "+n1+","+n2+" is "+hcf);
	}
}
