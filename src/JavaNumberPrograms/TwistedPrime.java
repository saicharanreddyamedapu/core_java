package JavaNumberPrograms;

import java.util.Scanner;
class TwistedPrime 
{

	public static int reverse(int num) 
	{
		int rev =0;
		while (num!=0)
		{
			int ld = num%10;
			rev = (rev*10)+ld;
			num = num/10;
		}
		return rev;
	}
	
	public static boolean checkPrime(int num)
	{
		int count = 0;
		for (int i =1 ;i<=num ;i++ )
		{
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static boolean checkTwistedPrime(int num) 
	{
		int rev = reverse(num);
		return checkPrime(rev);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if (checkPrime(num))
		{
			if (checkTwistedPrime(num))
				System.out.println(num +" is a twisted prime number");
			else
				System.out.println(num +" is not a twisted prime number");
		}
		else
			System.out.println(num +" is not a prime number");
	}
}
