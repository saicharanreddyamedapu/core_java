package classAndObject;

public class Employee {
	String name,gender,role;
	int age;
	double salary;
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Employee(String name,int age,String gender) {
		this(name,age);
		this.gender=gender;
	}
	
	public Employee(String name,int age,String gender,String role) {
		this(name,age,gender);
		this.role=role;
	}
	
	public Employee(String name,int age,String gender,String role,double salary) {
		this(name,age,gender,role);
		this.salary=salary;
	}
	public void details() {
		System.out.println("-----Employee Detials------");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Role:"+role);
		System.out.println("Salary:"+salary);
	}
	
}
