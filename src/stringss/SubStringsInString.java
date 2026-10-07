package stringss;

public class SubStringsInString {
	public static void main(String[] args) {
		String s="sai";
		for (int i = 0; i < s.length(); i++) {
//			String sub=""+s.charAt(i);
			String sub="";
//			System.out.println(s.charAt(i));
			for (int j = i; j < s.length(); j++) {
				sub=sub+s.charAt(j);
				System.out.println(sub);
			}
		}
	}
}
