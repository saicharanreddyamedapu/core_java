package classAndObject;

public class RectangleBox {

	int l,b,h;
	public void area() {
		if (h>0) {
			System.out.println("3D box area:"+(l*b*h));
		}
		else
			System.out.println("2D box area:"+(l*b));
			
	}
}
