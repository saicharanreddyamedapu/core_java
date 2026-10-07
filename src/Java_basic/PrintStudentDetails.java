package Java_basic;

import java.util.Scanner;
class PrintStudentDetails
{

public static void print(String name,String email,char gender,String degree,String stream,int yop,float cgpa)
{
	System.out.println("Name:"+name);
	System.out.println("E-mail:"+email);
	System.out.println("Gender:"+gender);
	System.out.println("Degree:"+degree);
	System.out.println("Stream:"+stream);
	System.out.println("Year of Passout:"+yop);
	System.out.println("CGPA:"+cgpa);
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Enter your gender(M/F/O)");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your degree");
		String degree = sc.next();
		System.out.println("Enter your stream");
		String stream = sc.next();
		System.out.println("Enter your YOP");
		int yop = sc.nextInt();
		System.out.println("Enter your CGPA");
		float cgpa = sc.nextFloat();
		
		print(name,email,gender,degree,stream,yop,cgpa);
	}
}
