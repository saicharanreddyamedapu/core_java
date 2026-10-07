package Java_basic;

class CheckChar
{
	public static void main(String [] args)
	{
	char c='5';
	String result = (c>='A' && c<='Z')? "an uppercase alphabet" : (c>='a' && c<='z')? "a lowercase alphabet" : (c>='0' && c<='9')? "digit" : "Special Character";
	System.out.println(c + " is " +result);
	}
}