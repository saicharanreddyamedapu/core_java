package array;

public class Nthmax {

	public static void main(String[] args) {

		int a[]= {10,13,117,18,9};
		int n=4;
		int nThmax=Integer.MAX_VALUE;		
		for (int i = 0; i < n; i++) {
			int cMax=Integer.MIN_VALUE;
			for (int j = 0; j < a.length; j++) {
				if (a[j]>cMax && a[j]<nThmax) {
					cMax=a[j];
				}
			}
			nThmax=cMax;
		}
		
		System.out.println(nThmax);
	}

}
