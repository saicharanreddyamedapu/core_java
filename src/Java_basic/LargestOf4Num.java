package Java_basic;

class LargestOf4Num
{
	public static void main(String [] main)
	{
	int a=89;
	int b=97;
	int c=82;
	int d=92;
	int result = (a>b && a>c && a>d)? a : (b>c && b>d)? b : (c>d)? c : d;
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	System.out.println("Largest of a,b,c,d is " + result);
	}
}