package Java_basic;

class AverageOfNumbers
{
	public static void main(String [] args)
	{
	int a = 18;
	int b = 31;
	int c = 33;
	int avg = (a+b+c)/3;
	System.out.println("Value of a = " + a);
	System.out.println("Value of b = " + b);
	System.out.println("Value of c = " + c);
	System.out.println("Average Value of a,b,c = " + avg);
	int comp = ~avg;
	System.out.println("Complement Value of average = " + comp);
	}
}