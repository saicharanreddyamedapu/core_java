package array;

public class Duplicate {
	

	public static void main(String[] args) {

		int a[]= {10,20,11,17,25,23,23,30,20,17,10,20,40};
		int visit=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=visit;
					count++;
				}
			}
			if (a[i]!=visit && count>1 && isPrime(a[i])) {
				System.out.println(a[i]);
			}

	}

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