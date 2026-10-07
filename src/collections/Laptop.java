package collections;

public class Laptop implements Comparable<Laptop> {
	String brand;
	int ram;
	double price;
	int storage;
	public Laptop(String brand, int ram, double price, int storage) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.storage = storage;
	}
	
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + ", storage=" + storage + "]\n";
	}

	@Override
	public int compareTo(Laptop o) {
		
		return this.brand.compareTo(o.brand);
	}
	
	
}
