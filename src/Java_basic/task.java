package Java_basic;

class task
{
	public static void main(String [] args)
	{
	int num = 31;
	if(num%2==0)
	{
	  int res=num*23;
	  System.out.println(res);
	} 
	else
	{
	  int q=num/3;
	  int r=num%3;
	  System.out.println("Quotient is " + q);
	  System.out.println("Remainder is " + r);
	}
	}
}