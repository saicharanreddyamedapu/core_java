package array;

public class SumOfAny2 {
	public static void main(String[] args) {
		int a[]= {3,5,8,2,0,6,-3,1};
		int t=5;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ((a[i]+a[j]==t)) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}
}
