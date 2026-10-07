package Java_basic;

class VowelOrNot
{
	public static void main(String [] args)
	{
	char c='i';
	String result = (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')? " is vowel" : " is not vowel";
	System.out.println(c + result);
	}
}