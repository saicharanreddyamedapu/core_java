package array;

public class SmallestInArray {

	public static void main(String[] args) {

		int a[]= {10,13,117,18,9};
		int smallest=Integer.MAX_VALUE;		
//		for (int i = 0; i < a.length; i++) {
//			if (smallest>a[i]) {
//				smallest=a[i];
//			}
//		}
//		System.out.println(smallest);

//	    Second smallest
		int ssmallest=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (smallest>a[i]) {
				ssmallest=smallest;
				smallest=a[i];
			}
			else if(a[i]<ssmallest && a[i]<smallest) {
				ssmallest=a[i];
			}
		}
		System.out.println(smallest);
		System.out.println(ssmallest);

	}

}
