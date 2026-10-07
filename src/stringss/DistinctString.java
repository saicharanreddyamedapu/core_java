package stringss;

public class DistinctString {
	public static void main(String[] args) {
		String s="abaaccc";
		String dis="";
		String dup="";
		for (int i = 0; i < s.length(); i++) {
			if (dis.indexOf(s.charAt(i))==-1) {
				dis=dis+s.charAt(i);
			}
			else if (dup.indexOf(s.charAt(i))==-1) {
				dup=dup+s.charAt(i);
			}
		}
		System.out.println(dis);
		System.out.println(dup);
	}
}
