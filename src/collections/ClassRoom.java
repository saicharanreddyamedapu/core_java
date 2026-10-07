package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoom {
	public static void main(String[] args) {
		ArrayList<Student> sl=new ArrayList<Student>();
		sl.add(new Student("Sai", 104, 82));
		sl.add(new Student("Rohith", 102, 65));
		sl.add(new Student("Rishi", 107, 39));
		sl.add(new Student("Shiva", 103, 70));
		sl.add(new Student("Abhi", 101, 50));
		System.out.println(sl);
		Collections.sort(sl);
		System.out.println(sl);
		int rank=1;
		for(Student s:sl) {
			s.rank=rank++;
		}
		System.out.println(sl);
	}
}