package Java_basic;

class DigitOrNot
{
	public static void main(String [] args)
	{
	char c='r';
	String result = (c>='0' && c<='9')? " is a digit" : " is not a digit";
	System.out.println(c + result);
	}
}