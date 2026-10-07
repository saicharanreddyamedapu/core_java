package arraylistss;

import java.util.Comparator;

public class FuelComp implements Comparator<Car>{

	
	public int compare(Car o1, Car o2) {
		return o1.fuel.compareTo(o2.fuel);
	}
	
}
