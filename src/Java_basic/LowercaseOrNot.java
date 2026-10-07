package Java_basic;

class LowercaseOrNot
{
	public static void main(String [] args)
	{
	char c='r';
	String result = (c>='a' && c<='z')? " is a lowercase " : " is not a lowercase";
	System.out.println(c + result);
	}
}