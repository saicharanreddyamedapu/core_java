package array;

import java.util.Arrays;

public class SortZeros {
	public static void main(String[] args) {
		int a[]= {4,5,0,6,0,0,2,6,2,0,2};
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) {
				a[index]=a[i];
				index++;
			}
		}
		while(index < a.length) {
			a[index++]=0;
//			index++;
		}
		System.out.println(Arrays.toString(a));
	}
}
