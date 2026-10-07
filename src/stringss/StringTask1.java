package stringss;


public class StringTask1 {
	public static void main(String[] args) {
		String s="is2 class4 this1 programming3";
		String sn="";
		String[] s1=s.split(" ");
		int n=s1.length;
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (i==s1[j].charAt(s1[j].length()-1)-48) {
					sn=sn+s1[j].substring(0,s1[j].length()-1)+" ";
				}
			}
		}
		System.out.println(sn);
		
	}
}