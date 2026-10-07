package array;


public class CommonIn2Array {

	public static void main(String[] args) {

		int a[]= {2,53,45,7,6,32};
		int b[]= {3,42,53,6,32,45,66,76,3};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
