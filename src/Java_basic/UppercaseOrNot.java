package Java_basic;

class UppercaseOrNot
{
	public static void main(String [] args)
	{
	char c='r';
	String result = (c>='A' && c<='Z')? " is an uppercase " : " is not an uppercase";
	System.out.println(c + result);
	}
}