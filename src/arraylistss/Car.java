package arraylistss;

public class Car implements Comparable<Car>{
	String brand;
	int price;
	double engine;
	String fuel;
	public Car(String brand, int price, double engine, String fuel) {
		super();
		this.brand = brand;
		this.price = price;
		this.engine = engine;
		this.fuel = fuel;
	}
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", engine(cc)=" + engine + ", fuel=" + fuel + "]\n";
	}
	@Override
	public int compareTo(Car o) {
		return this.brand.compareTo(o.brand);
	}
	
}