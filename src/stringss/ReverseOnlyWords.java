package stringss;

public class ReverseOnlyWords {
	public static void main(String[] args) {
		String s="java web sql api";
		String rev="";
		String st[]=s.split(" ");
		for (int i = 0; i < st.length; i++) {
			String s1=st[i];
			String r="";
			for (int j = 0; j < s1.length(); j++) {
				r=s.charAt(j)+r;
			}
			rev=rev+r+" ";
		}
		System.out.println(rev);
	}
}