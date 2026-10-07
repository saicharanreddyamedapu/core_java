package array;

public class BikeUser {

	public static void main(String[] args) {
//		Bike name = new Bike("TVS", 95000);
		Bike [] b= {new Bike("aTVS", 95000),
				new Bike("Hero", 125000),
				new Bike("Yamaha", 175000),
				new Bike("Royal Enfield", 225000),
				new Bike("evHonda", 150000)};
//		task-1
		for (int i = b.length-1; i >= 0; i--) {
			System.out.println(b[i].brand);
		}
		
//		task-2
		double max=0;
		Bike temp=null;
		for (int i = 0; i < b.length; i++) {
			if (b[i].price>max) {
				max=b[i].price;
				temp=b[i];
			}
		}
		System.out.println(temp);
//		for (int i = 0; i < b.length; i++) {
//			if (max==b[i].price) {
//				System.out.println(b[i]);
//			}
//		}
		
//		task-3
		double avg=0;
		for (int i = 0; i < b.length; i++) {
			avg=avg+b[i].price;
		}
		avg=avg/b.length;
		System.out.println("Average price:"+avg);
		System.out.println();
//		task-4
		Bike [] b2 = new Bike[b.length];
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].price>=avg) {
				b2[i]=b[i];
				count++;
				System.out.println(b[i]);
				for (int j = 0; j < count; j++) {
					b2[j]=b[i];
				}
			}
		}
		for (Bike bike : b2) {
			System.out.println(bike);
		}
		System.out.println();
//		task-5
		
		for (int i = 0; i < b.length; i++) {
			if (b[i].brand.charAt(0)=='a'||b[i].brand.charAt(0)=='e'||b[i].brand.charAt(0)=='i'||b[i].brand.charAt(0)=='o'||b[i].brand.charAt(0)=='u') {				
				System.out.println(b[i]);
			}
		}
	}

}
