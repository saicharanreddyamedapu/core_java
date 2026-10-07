package classAndObject;

public class Box {
	int l,b,h;
	public Box(int l, int b,int h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public Box(int l, int b) {
		this.l=l;
		this.b=b;
	}
	public void area() {
		if(this.h>0)
			System.out.println("3D box area:"+(l*b*h));
		else
		System.out.println("2D box area:"+(l*b));
	}
}
