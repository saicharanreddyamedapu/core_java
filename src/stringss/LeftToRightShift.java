package stringss;

public class LeftToRightShift {
	public static void main(String[] args) {
		String s="abcd";
		int n=3;
		String s1=s.substring(n,s.length());
		String s2=s.substring(0,n);
		System.out.println(s1+s2);
	}
}
