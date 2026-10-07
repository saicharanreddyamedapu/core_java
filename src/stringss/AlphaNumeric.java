package stringss;

public class AlphaNumeric {
	public static void main(String[] args) {
		String s="a3b4c1";
//		String n="";
		for (int i = 0; i < s.length()-1; i++) {
			int c=s.charAt(i+1);
//			if (s.charAt(i)<'0' || s.charAt(i)>'9') {
//				c=s.charAt(i+1);
//			}
//			System.out.println(c);
			for (char j = '1'; j <= c; j++) {
				System.out.print(s.charAt(i)+"");
			}
			i++;
		}
	}
}
