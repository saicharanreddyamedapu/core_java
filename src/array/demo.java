package array;

public class demo {

	public static void main(String[] args) {
//		int a[]= {10,13,117,18,9};
//		int b[]=new int[a.length];
//		for (int i = 0; i < b.length; i++) {
//			b[i]=a[i];
//			System.out.println(b[i]);
//	}

		int a[]= {2,0,4,9,13,6,10,4};
		int n=10;
		for (int i = 1; i <=n; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(i==a[j]) {
					count++;
					break;
				}
			}
			if (count==0) 
				System.out.println(i);
		}
	}
}
