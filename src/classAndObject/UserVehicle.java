package classAndObject;

public class UserVehicle {

	public static void main(String[] args) {

		Bike b1=new Bike("tvs",90000);
		Bike b2=new Bike("tvs",90000);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
