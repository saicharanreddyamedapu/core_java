package array;

public class SumEqualsToTarget {

	public static void main(String[] args) {
		int a[]= {3,2,9,6,-1,8,5,0,4};
		int t=5;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]+a[i+1]==t) {
				System.out.println(a[i]+","+a[i+1]);
			}
		}
	}

}
