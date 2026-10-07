package array;

import java.util.Arrays;

public class LeftToRightSwap {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int n=4;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++) {			
			int temp=a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
