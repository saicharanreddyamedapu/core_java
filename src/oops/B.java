package oops;

class B
{
	static int a= 100;
	public static void main(String[] args) 
	{
		
		System.out.println(a);
		System.out.println(A.a);
		A.main(null);
		A obj = new A();
		obj.test();
		System.out.println(obj.b);
	}
}
