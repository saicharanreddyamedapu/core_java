package Java_basic;

import java.util.Scanner;
class VoteEligibility_d
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age");
	int age = sc.nextInt();
	if(age>=18)
	{
	  System.out.println("User is eligible to vote");
	} 
	else
	{
	  System.out.println("User is not eligible to vote");
	}
	}
}