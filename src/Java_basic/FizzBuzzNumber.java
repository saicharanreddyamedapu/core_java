package Java_basic;

class FizzBuzzNumber
{
	public static void main(String [] args)
	{
	int n = 48;
	//String result = (n%3==0 && n%5==0)? "a FizzBuzz number" : (n%3==0)? "Fizz" : (n%5==0)? "Buzz" : "not a FizzBuzz number";
	String result = (n%3==0)? (n%5==0)? "a FizzBuzz number" : "Fizz" : (n%5==0)? "Buzz" : "not a FizzBuzz number";  
	System.out.println(n + " is " + result);
	}
}