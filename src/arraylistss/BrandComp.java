package arraylistss;

import java.util.Comparator;

public class BrandComp implements Comparator<Car>{

	public int compare(Car o1, Car o2) {
		
		return o1.brand.compareTo(o2.brand);
	}

}
