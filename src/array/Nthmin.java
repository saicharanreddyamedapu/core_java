package array;

public class Nthmin {
	public static void main(String[] args) {

		int a[]= {10,13,117,18,9};
		int n=3;
		int nThmin=Integer.MIN_VALUE;		
		for (int i = 0; i < n; i++) {
			int cMin=Integer.MAX_VALUE;
			for (int j = 0; j < a.length; j++) {
				if (a[j]<cMin && a[j]>nThmin) {
					cMin=a[j];
				}
			}
			nThmin=cMin;
		}
		
		System.out.println(nThmin);
}
}