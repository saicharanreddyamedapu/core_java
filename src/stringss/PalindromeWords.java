package stringss;

public class PalindromeWords {
	public static void main(String[] args) {
		String s="hi madam hello malayalam";
		
		String[] st=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String s1=st[i];
			String r="";
			for (int j = 0; j < s1.length(); j++) {
				r=s1.charAt(j)+r;
			}
			if (s1.equals(r)) {
				System.out.println(s1);
			}
		}
	}
}
