package JavaNumberPrograms;

import java.util.Scanner;
class SumOfOddFactors
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0 && i%2==1)
			sum=sum+i;
	}
	System.out.println("The sum of odd factors of "+num+" is "+sum);

	}
}