package demo;

public class InversionsInArray {
	public static void main(String[] args) {
		int[] a= {5,3,1,4,2};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
