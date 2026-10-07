package collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add('f');
		al.add(12);
		al.add("java");
		al.add(18.5);
		al.add(0, "virat");
		al.add(4, "Bhuvi");
//		al.addAll(al);
//		al.addAll(3, al);
		System.out.println(al);
		System.out.println(al.get(3));
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		
	}
}
