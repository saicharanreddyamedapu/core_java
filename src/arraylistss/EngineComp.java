package arraylistss;

import java.util.Comparator;

public class EngineComp implements Comparator<Car>{


	public int compare(Car o1, Car o2) {
		
		return (int)(o1.engine-o2.engine);
	}
	
}
