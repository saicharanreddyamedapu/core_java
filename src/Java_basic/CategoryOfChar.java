package Java_basic;

//check whether given char is a lowercase or uppercase or digit or special character
import java.util.Scanner;
class CategoryOfChar
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the character");
	char ch = sc.next().charAt(0);
	if(ch>='a' && ch<='z')
	{
	System.out.println(ch + " is lowercase alphabet");
	}
	else if(ch>='A' && ch<='Z')
	{
	System.out.println(ch + " is uppercase alphabet");
	}
	else if(ch>='0' && ch<='9')
	{
	System.out.println(ch + " is digit");
	}
	else
	{
	System.out.println(ch + " is special character");
	}
	}
}