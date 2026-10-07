package JavaNumberPrograms;

import java.util.Scanner;
class SumOfEvenFactors
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0 && i%2==0)
			sum=sum+i;
	}
	if(sum>0)
		System.out.println("The sum of factors of "+num+" is "+sum);
	else
		System.out.println("There are no even factors for " + num);
	}
}