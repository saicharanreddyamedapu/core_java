package arraylistss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ShowRoom {
	public static void main(String[] args) {
		ArrayList<Car> cl=new ArrayList<Car>();
		cl.add(new Car("Mahindra", 1800000, 2180,"Diesel" ));
		cl.add(new Car("Volkswagen", 1575000, 1499,"Petrol" ));
		cl.add(new Car("Tata", 1228990, 999.9, "Petrol" ));
		cl.add(new Car("Toyota", 2895000, 2694,"Diesel" ));
		cl.add(new Car("Skoda", 2235000, 1499.9,"Petrol" ));
		
		System.out.println(cl);
//		Collections.sort(cl);
		
		Comparator <Car> c=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice to sort(1-4)\n1.Brand\n2.Price\n3.Engine(cc)\n4.Fuel");
		
		String s=sc.next();
		if(s.equals("1")||s.equals("Brand")) {
			c=(Car c1,Car c2)->{
				return c1.brand.compareTo(c2.brand);
			};
		}
		
		else if(s.equals("2")) {
			c=(Car c1,Car c2)->{
				return c1.price-c2.price;
			};
		}
		
		else if(s.equals("3")) {
			c=(Car c1,Car c2)->{
				return (int)(c1.engine-c2.engine);
			};
		}
		
		else if(s.equals("4")) {
			c=(Car c1,Car c2)->{
				return c1.fuel.compareTo(c2.fuel);
			};
		}
		else {
			c=(Car c1,Car c2)->{
				return c1.brand.compareTo(c2.brand);
			};
			System.out.println("Not a valid choice.By default sorting is done based on brand");
		}
		Collections.sort(cl,c);
		System.out.println(cl);
		
		
//		if (s.equals("1")) {
//			c=new BrandComp();
//		}
//		else if (s.equals("2")) {
//			c=new PriceComp();
//		}
//		else if (s.equals("3")) {
//			c=new EngineComp();
//		}
//		else if (s.equals("4")) {
//			c=new FuelComp();
//		}
//		else {
//			c=new BrandComp();
//			System.out.println("Not a valid choice.By default sorting is done based on brand");
//		}
//		Collections.sort(cl,c);
//		System.out.println(cl);
	}
}
