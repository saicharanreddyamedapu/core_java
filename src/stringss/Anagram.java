package stringss;

public class Anagram {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silemt";
		if (s1.length()==s2.length()) {
			boolean b=true;
			System.out.println(b);
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					boolean b1=false;
					b1=b1||s1.charAt(i)==s2.charAt(j);
//					System.out.println(b1);
					
					b=b1;
				}
				
			}
//			System.out.println(b);
			if (b) {
				System.out.println("anagram");
			}
		}
		else {
			System.out.println("Not anagram");
		}
	}
}
