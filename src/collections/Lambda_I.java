package collections;

public class Lambda_I{
	public static void main(String[] args) {
		System.out.println("main");
//		Functional_I obj=()->{
//			System.out.println("from add");
//		};
//		obj.add();
//		Functional_I obj=(int x,int y)->{
//			System.out.println(x+y);
//		};
//		obj.add(1, 3);
//		Functional_I obj=(x,y)->{
//			System.out.println(x+y);
//		};
//		obj.add(12, 13);
		
//		Functional_I obj=(x,y)->{
//			return x+y;
//		};
//		obj.add(12, 13);
		
		Functional_I obj=(x,y)->x+y;
		System.out.println(obj.add(12, 18));
	}
}
