package array;

import java.util.Arrays;

public class ArrayUnion {

	public static void main(String[] args) {
		
		int a[]= {2,53,45,7,6,32};
		int b[]= {3,42,53,6,32,45,66,76,3};
		int u[]=new int[a.length+b.length];
		int index=0;
		for (int i = 0; i < a.length; i++) {
				u[index++]=a[i];
			}
		System.out.println(index);
		for (int i = 0; i < b.length; i++) {
			int count=0;
			for (int k = 0; k < a.length; k++) {
				if (a[k]==b[i]) {
					count++;
					break;
				}
			}
			if (count==0) {
				u[index++]=b[i];
			}
		}
		System.out.println(Arrays.toString(u));
		for (int i = 0; i < index; i++) {
			System.out.print(u[i]+" ");
		}
		}
}
