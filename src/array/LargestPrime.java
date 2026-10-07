package array;



public class LargestPrime {
	public static void main(String[] args) {
		int a[]= {12,34,54,23,65,43};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max && isPrime(a[i])) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	private static boolean isPrime(int n) {
		int count=0;
		for (int i = 1; i <=n ; i++) {
			if (n%i==0) {
				count++;
			}
		}
		return count==2;
}
}