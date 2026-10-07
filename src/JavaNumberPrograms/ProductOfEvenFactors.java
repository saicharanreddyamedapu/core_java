package JavaNumberPrograms;

import java.util.Scanner;
class ProductOfEvenFactors
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int prod=1;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0 && i%2==0)
			prod=prod*i;
	}
	if(prod==1)
		System.out.println("There are no even factors for " + num);

	else
		System.out.println("The product of factors of "+num+" is "+prod);		
	}
}