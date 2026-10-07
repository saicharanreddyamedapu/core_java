package Java_basic;

class FizzBuzzOrNot
{
	public static void main(String [] args)
	{
	int n = 45;
	String result = (n%3==0 && n%5==0)? "a FizzBuzz number" : "not a FizzBuzz number";
	System.out.println(n + " is " + result);
	}
}