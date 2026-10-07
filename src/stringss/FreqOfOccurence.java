package stringss;



public class FreqOfOccurence {
	public static void main(String[] args) {
		String s="abaacccdroinafa";
		String dis="";
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			if (dis.indexOf(s.charAt(i))==-1) {
				dis=dis+s.charAt(i);
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
				System.out.println(s.charAt(i)+"-->"+count);
			}
		}
	}
}