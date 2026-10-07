package stringss;

public class LowerToUpper {

	public static void main(String[] args) {

		String s="ABc4d%eF";
		String up="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>=97 && s.charAt(i)<=122) {
				up=up+(char)(s.charAt(i)-32);
			}
			else {
				up=up+(char)(s.charAt(i));
			}
		}
		System.out.println(up);
	}

}
