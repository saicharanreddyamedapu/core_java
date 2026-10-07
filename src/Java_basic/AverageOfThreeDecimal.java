package Java_basic;

import java.util.Scanner;
class AverageOfThreeDecimal
{
	public static void average(double x,double y,double z)
	{
		double res = (x+y+z)/3;
		System.out.println("Average of "+x+","+y+","+z+" is "+ res);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double x = sc.nextDouble();
		System.out.println("Enter 2nd number");
		double y = sc.nextDouble();
		System.out.println("Enter 3rd number");
		double z = sc.nextDouble();
		
		average(x,y,z);
	}
}