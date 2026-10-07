package collections;

public class Student implements Comparable<Student>{
	String name;
	int id;
	double marks;
	int rank;
	public Student(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		if(this.rank==0)
			return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]\n";			
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", rank=" + rank + "]\n";
	}
	public int compareTo(Student o) {
//		if(this.marks>o.marks)
//			return -1;
//		if(this.marks<o.marks)
//			return 1;
//		return 0;
		return (int)(o.marks-this.marks);
	}
	
}
