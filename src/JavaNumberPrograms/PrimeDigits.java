package JavaNumberPrograms;

import java.util.Scanner;
class PrimeDigits
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	System.out.println("The prime digits in "+num+":-");
	while(num>0)
	{
		int ld=num%10;
		if(ld==2 || ld==3 || ld==5 || ld ==7)
			System.out.println(ld);
		num=num/10;
	}
	}
}