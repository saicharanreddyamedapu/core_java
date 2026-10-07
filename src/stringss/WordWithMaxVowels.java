package stringss;

public class WordWithMaxVowels {
	public static void main(String[] args) {
			
			String s="Sai Charan Reddy";
			String[] a=s.split(" ");
			int max=0;
			String largest="";
			for (int i = 0; i < a.length; i++) {
				int count=isVowel(a[i]);
				if (count>max) {
					max=count;
					largest=a[i];
				}
			}
			System.out.println(largest);
	
	}
	
	public static int isVowel(String s) {
		int count=0;
		String vowel="AEIOUaeiou";
		for (int i = 0; i < s.length(); i++) {
			if (vowel.contains(s.charAt(i)+"")) {
				count++;
			}
		}
		return count;
	}
}
