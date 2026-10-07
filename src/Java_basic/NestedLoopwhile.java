package Java_basic;

class NestedLoopwhile
{
	public static void main(String [] args)
	{
	int i=1;
	while(i<=3)
	{
		System.out.println("Outer loop starts-"+i);
		
		int j=1;
		while(j<=2)
		{
			System.out.println("Execution of inner loop "+j);
			j++;
		}
		i++;
	}
	System.out.println("Outer loop terminated");
	}
}