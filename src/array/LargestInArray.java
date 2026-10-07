package array;

public class LargestInArray {

	public static void main(String[] args) {

		int a[]= {10,13,117,18,9};
		int largest=0;
		largest=Integer.MIN_VALUE;		
		for (int i = 0; i < a.length; i++) {
			if (largest<a[i]) {
				largest=a[i];
			}
		}
		System.out.println(largest);
		
		
//	    Second largest
		int slargest=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (largest<a[i]) {
				slargest=largest;
				largest=a[i];
			}
			else if(a[i]>slargest && a[i]<largest) {
				slargest=a[i];
			}
		}
		
		System.out.println(slargest);
	}

}
