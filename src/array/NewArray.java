package array;

import java.util.Arrays;


public class NewArray {

	public static void main(String[] args) {

		int a[]= {10,20,10,10,50,20,30,30,20,20,10,20};
		int visit=Integer.MIN_VALUE;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=visit;
				}
			}
			
			if (a[i]!=visit) {				
				count++;
			}
		}
		System.out.println(count);
		int b[]=new int[count];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=visit) {
					b[index]=a[i];
					index++;
			}
		}
		System.out.println(Arrays.toString(b));
}
}