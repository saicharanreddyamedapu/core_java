package classAndObject;

public class Car {
	String brand;
	double price;
	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public boolean equals(Object e) {
		Bike temp=(Bike)e;
		return this.brand==temp.brand&&this.price==temp.price;
	}

}
