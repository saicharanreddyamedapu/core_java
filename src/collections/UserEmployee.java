package collections;

import java.util.ArrayList;
import java.util.Collections;

public class UserEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> el=new ArrayList<Employee>();
		el.add(new Employee("Sai", 201, 45000));
		el.add(new Employee("Rohith", 202, 40000));
		el.add(new Employee("Rishi", 203, 43000));
		el.add(new Employee("Abhi", 104, 50000));
		el.add(new Employee("Shiva", 305, 30000));
		System.out.println(el);
		Collections.sort(el);
		System.out.println();
		System.out.println(el);
	}
}
