package classAndObject;

public class UserBox {
	public static void main(String[] args) {
		RectangleBox r1 = new RectangleBox();
		r1.l=12;
		r1.b=2;
		r1.h=3;
		r1.area();

		RectangleBox r2 = new RectangleBox();
		r2.l=12;
		r2.b=2;
		
		r2.area();
	}
}