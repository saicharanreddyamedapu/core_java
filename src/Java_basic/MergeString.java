package Java_basic;

import java.util.Scanner;
class MergeString
{
	public static void mergeString(String x,String y,String z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String x = sc.next();
		System.out.println("Enter 2nd String");
		String y = sc.next();
		System.out.println("Enter 3rd String");
		String z = sc.next();
		
		mergeString(x,y,z);
	}
}