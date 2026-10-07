package stringss;

public class PalindromePossibility {
	public static void main(String[] args) {
		String s="malayalam";
		for (int i = 0; i < s.length(); i++) {
			String r=""+s.charAt(i);
			for (int j = i+1; j < s.length(); j++) {
				r=r+s.charAt(j);
				if (isPalindrome(r)) {
					System.out.println(r);
				}
			}
		}
	}

	public static boolean isPalindrome(String r) {
		String p="";
		for (int i = 0; i < r.length(); i++) {
			p=r.charAt(i)+r;
			}
		
		return r.equals(p);
}
}
