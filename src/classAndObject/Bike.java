package classAndObject;

public class Bike {
	String brand;
	double price;
//	String color;
	public Bike(String brand,double price) {
		this.brand=brand;
		this.price=price;
//		this.color=color;
	}
	public void details() {
		System.out.println("-------Bike details--------");
		System.out.println(brand);
		System.out.println(price);
//		System.out.println(color);
	}
//	public boolean equals(Object e) {
//		Car temp=(Car)e;
//		return this.brand==temp.brand&&this.price==temp.price;
//	}
	public boolean equals(Object e) {
		Bike temp=(Bike)e;
		return this.brand==temp.brand&&this.price==temp.price;
	}
}
