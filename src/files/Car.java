package files;

import java.io.Serializable;

public class Car implements Serializable{
	String brand,color;
	double cc;
	
	public Car(String brand, String color, double cc) {
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", cc=" + cc + "]";
	}
	
}
