package stringss;

public class StringManipulation {

	public static void main(String[] args) {

		String s="abcdef";
		System.out.println(isEven(s));
		System.out.println(isVowel(s));
		System.out.println(isodd(s));
	}

	public static String isodd(String s) {
		String ev="",odd="";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				ev=ev+(char)(s.charAt(i)-32);
			}
			else {
				odd=odd+s.charAt(i);
			}
		}
		return odd+ev;
	}

	public static String isVowel(String s) {
		String vow="",res="";
		String vowel="AEIOUaeiou";
		for (int i = 0; i < s.length(); i++) {
			if (vowel.contains(s.charAt(i)+"")) {
				vow=vow+s.charAt(i);
			}
			else {
				res=res+s.charAt(i);
			}
			}
			
			
		
		return vow+res;
	}

	public static String isEven(String s) {
		String ev="",odd="";
		for (int i = 0; i < s.length(); i++) {
			if (i%2==0) {
				ev=ev+s.charAt(i);
			}
			else {
				odd=odd+s.charAt(i);
			}
		}
		return ev+odd;
	}
	
}

