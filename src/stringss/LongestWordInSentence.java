package stringss;

public class LongestWordInSentence {
	public static void main(String[] args) {
		
		String s="Sai Charan Reddy";
		String[] a=s.split(" ");
		String max="";
		for (int i = 0; i < a.length; i++) {
			if (a[i].length()>max.length()) {
				max=a[i];
			}
		}
		System.out.println(max);
	
	}
}
