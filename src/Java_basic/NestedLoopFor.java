package Java_basic;

class NestedLoopFor
{
	public static void main(String [] args)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Outer loop Starts-"+i);
			
			for(int j=1;j<=2;j++)
			{
				System.out.println("Execution of inner loop "+j);
			}
		}
		System.out.println("Outer loop termination");
	}
}