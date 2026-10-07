package stringss;

public class CountSpaces {
	public static void main(String[] args) {
		
	String s="Jai   Shree Ram  jii";
	int count=0;
	for (int i = 0; i < s.length()-1; i++) {
		if (s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
			count++;
		}
	}
	System.out.println(count+1);
	}

}
