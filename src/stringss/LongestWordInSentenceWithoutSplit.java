package stringss;

public class LongestWordInSentenceWithoutSplit {
	public static void main(String[] args) {
		String s="this is programming class fhaufuavunaa";
		String word="";
		String largest="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			}
			else {
				if (word.length()>largest.length()) {
					largest=word;
				}
				word="";
			}
		}
		if (word.length()>largest.length()) {
			largest=word;
		}
		System.out.println(largest);
	}
}

