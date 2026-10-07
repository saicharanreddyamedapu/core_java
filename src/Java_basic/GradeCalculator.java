package Java_basic;

import java.util.Scanner;
class GradeCalculator
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the percentage");
	double per = sc.nextDouble();
	if(per>=85.00 && per<=100)
	{
	System.out.println("Distinction");
	}
	else if(per>=80.00 && per<85.00)
	{
	System.out.println("Very Good");
	}
	else if(per>=70.00 && per<80.00)
	{
	System.out.println("Good");
	}
	else if(per>=50.00 && per<70.00)
	{
	System.out.println("Pass");
	}
	else
	{
	System.out.println("Fail");
	}
	}
}