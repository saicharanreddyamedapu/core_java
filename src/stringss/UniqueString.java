package stringss;

public class UniqueString {
	public static void main(String[] args) {
		String s="abaacccd";
		String uni="";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				uni=uni+s.charAt(i);
			}
		}
		System.out.println(uni);
	}
}
