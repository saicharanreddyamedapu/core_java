package Java_basic;

class NestedLoopForWhile
{
	public static void main(String [] args)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Outer loop Starts-"+i);
			
			int j=1;
			while(j<=4)
			{
				System.out.println("Execution of inner loop "+j);
				j++;
			}
		}
		System.out.println("Outer loop termination");
	}
}