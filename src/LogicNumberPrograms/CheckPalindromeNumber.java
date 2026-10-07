package LogicNumberPrograms;

import java.util.Scanner;
class CheckPalindromeNumber
{
	public static int reverse(int num)
	{
		int rev = 0;
		while (num>0)
		{
			int ld = num%10;
			rev = (rev*10)+ld;
			num = num/10;
		}
		return rev;
	}

	public static void checkPalindrome(int num)
	{
		int reverse = reverse(num);
		if(reverse == num)
			System.out.println(num + " is a Palindrome number");
		else
			System.out.println(num + " is not a Palindrome number");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		checkPalindrome(num);
	}
}
