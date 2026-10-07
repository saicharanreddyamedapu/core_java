package JavaNumberPrograms;

import java.util.Scanner;
class DigitExctraction
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	System.out.println("The digits in "+num+" are");
	while(num>0)
	{
		int ld=num%10;
		System.out.println(ld);
		num=num/10;
	}
	}
}