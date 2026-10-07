package Java_basic;

import java.util.Scanner;
class DynamicCalculator
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Options");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Modulus");
	System.out.println("Choose an operation");
	int op=sc.nextInt();
	int res;
	switch(op)
	{
	case 1:{
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		res=num1+num2;
		System.out.println("Result :- "+ num1 + " + " + num2 + " = " + res);
		}break;
	case 2:{
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		res=num1-num2;
		System.out.println("Result :- "+ num1 + " - " + num2 + " = " + res);
		}break;
	case 3:{
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		res=num1*num2;
		System.out.println("Result :- "+ num1 + " * " + num2 + " = " + res);
		}break;
	case 4:{
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		res=num1/num2;
		System.out.println("Result :- "+ num1 + " / " + num2 + " = " + res);
		}break;
	case 5:{
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		res=num1%num2;
		System.out.println("Result :- "+ num1 + " % " + num2 + " = " + res);
		}break;
	default:{
		System.out.println("Selected Invalid operation");
		}
	}
}
}