package collections;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]\n";
	}

	
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	
	}
//		public int compareTo(Employee o) {
//		if (this.id>o.id) {
//			return 1;
//		}
//		if (this.id<o.id) {
//			return -1;
//		}
//		return 0;
//	}
	
	
}
