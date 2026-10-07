package programming;

public class EmptySeats {
	public static void main(String[] args) {
		String s = "0XX000X0000XXX";
		int n = 3, count = 0;
		for (int i = 0; i < s.length() - (n - 1); i++) {
			String st = "";
			for (int j = i; j < i + n; j++) {
				if (s.charAt(j) == '0') {
					st += s.charAt(j);
				} else {
					break;
				}
			}
			if (st.length() == n) {
				if (s.length() == n) {
					count++;
				} else if (i == 0 && s.charAt(i + n) != '0') {
					count++;
				} else if (s.length() == i + n && s.charAt(i - 1) != '0') {
					count++;
				} else if (s.charAt(i - 1) != '0' && s.charAt(i + n) != '0') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
