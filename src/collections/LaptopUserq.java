package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LaptopUserq {
	public static void main(String[] args) {
		Comparator<Laptop> c=(e1,e2)->{
			return e2.brand.compareTo(e1.brand);
		};
//		PriorityQueue<Laptop> q=new PriorityQueue<Laptop>();
		PriorityQueue<Laptop> q=new PriorityQueue<Laptop>(c);
		
		q.add(new Laptop("Lenovo", 16,55000 , 512));
		q.add(new Laptop("Asus", 8,65000 , 512));
		q.add(new Laptop("Macbook", 16,100000 , 256));
		q.add(new Laptop("Samsung", 32,150000 , 1024));
		q.add(new Laptop("Hp", 8,40000 , 128));
		
		System.out.println(q);
	}
}
