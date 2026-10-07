package stringss;

public class Demo {

	public static void main(String[] args) {
		String s="viratkohli";
		String n="";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				n=n+(char)(s.charAt(i)-32);
			}
			else {
				n=n+(char)(s.charAt(i));
			}
		}
		System.out.println(n);
	}

}
