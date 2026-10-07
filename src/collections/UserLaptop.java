package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UserLaptop {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Laptop("Lenovo", 16,55000 , 512));
		al.add(new Laptop("Asus", 8,65000 , 512));
		al.add(new Laptop("Macbook", 16,100000 , 256));
		al.add(new Laptop("Samsung", 32,150000 , 1024));
		al.add(new Laptop("Hp", 8,40000 , 128));
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------2");
		ListIterator ltr = al.listIterator(al.size());
		while (ltr.hasPrevious()) {
			Laptop temp=(Laptop)ltr.previous();
			System.out.println(temp.brand);
		}
		System.out.println("------------------------3");
		double avg=0;
		for(Object e:al) {
			Laptop temp=(Laptop)e;
			avg=avg+temp.price;
		}
		avg=(avg)/al.size();
		System.out.println("Average price of Laptop:"+avg);
		System.out.println("--------------------------4");
		
		ArrayList nl=new ArrayList();
		for(Object e:al) {
			Laptop temp=(Laptop)e;
			if (temp.price>=avg) {
				nl.add(e);
			}
		}
		System.out.println(nl);
		
		System.out.println("------------------------5");
		String vow="AEIOUaeiou";
		for(Object e:al) {
			Laptop temp=(Laptop)e;
			if (vow.contains(temp.brand.charAt(0)+"")) {
				System.out.println(e);
			}
		}
	}
}
