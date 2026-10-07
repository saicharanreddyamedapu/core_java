package Java_basic;

class NestedLoopWhileFor
{
	public static void main(String [] args)
	{
	int i=1;
	while(i<=3)
	{
		System.out.println("Outer loop starts-"+i);
		
		for(int j=1;j<=3;j++)
		{
			System.out.println("Execution of inner loop "+j);
			
		}
		i++;
	}
	System.out.println("Outer loop terminated");
	}
}