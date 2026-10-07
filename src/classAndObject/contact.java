package classAndObject;

public class contact {
	String name;
	long phn;
	public contact(String name,long phn) {
		this.name=name;
		this.phn=phn;
	}
	public void save() {
		System.out.println("Saved successfully...");
	}
	public void details() {
		System.out.println("Contact Details");
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phn);
	}
}
