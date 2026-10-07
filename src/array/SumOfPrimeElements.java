package array;

public class SumOfPrimeElements {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,13,7,8,19};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(int n) {
		int count=0;
		for (int j = 1; j <=n; j++) {
			if (n%j==0) {
				count++;
			}
		}
//		if (count==2) {
//			return true;
//		}
//		return false;
		return count==2;
	}

}
