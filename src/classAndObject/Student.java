package classAndObject;

public class Student {
	String name;
	int id;
	String gender;
	double tp;
	double twp;
	public Student(String name,	int id,	String gender, double tp, double twp) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.tp=tp;
		this.twp=twp;
	}
	public void info() {
		System.out.println("-----Student details------");
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("gender:"+gender);
		System.out.println("10th %:"+tp);
		if (twp>0) {			
			System.out.println("12th %:"+twp);
		}
	}
}
