package JavaNumberPrograms;

import java.util.Scanner;
class EvenDigits
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	System.out.println("The Even the digits in "+num+":-");
	while(num>0)
	{
		int ld=num%10;
		if(ld%2==0)
			System.out.println(ld);
		num=num/10;
	}
	}
}