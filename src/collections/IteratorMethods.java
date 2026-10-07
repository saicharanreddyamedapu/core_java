package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorMethods {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al.iterator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(al);
//		itr.hasNext();
//		itr.next();
	}
}
