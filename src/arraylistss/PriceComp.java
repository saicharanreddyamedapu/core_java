package arraylistss;

import java.util.Comparator;

public class PriceComp implements Comparator<Car> {

	public int compare(Car o1, Car o2) {
		
		return (o1.price-o2.price);
	}
	
}
