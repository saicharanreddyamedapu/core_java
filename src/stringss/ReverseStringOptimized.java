package stringss;

public class ReverseStringOptimized {
	public static void main(String[] args) {
		String s = "Rohith";
		String first = "", last = "";
		int f = 0, l = s.length() - 1;
		while (f <= l) {
			if (f == l) {
				first = s.charAt(f) + first;
			} else {
				first = s.charAt(f) + first;
				last = last + s.charAt(l);
			}
			f++;
			l--;
		}
		System.out.println(last + first);
	}
}
