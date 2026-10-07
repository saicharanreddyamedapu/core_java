package Java_basic;

class LargestOf3Num
{
	public static void main(String [] main)
	{
	int a=99;
	int b=97;
	int c=82;
	int result = (a>b && a>c)? a : (b>c)? b : c;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("Largest of a,b,c is " + result);
	}
}