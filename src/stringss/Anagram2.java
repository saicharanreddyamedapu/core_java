package stringss;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		if (s1.length()==s2.length()) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			int c=0;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i]==c2[i]) {
					c++;
				}
				else {
					break;
				}
			}
			if (c==s1.length()) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
		}
		else {
			System.out.println("not anagram");
		}
	}
}
