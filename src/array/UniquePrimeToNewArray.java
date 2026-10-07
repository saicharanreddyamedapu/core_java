package array;

public class UniquePrimeToNewArray {

	public static void main(String[] args) {

		int a[]= {10,20,11,17,25,23,23,30,20,17,10,20,40};
		int visit=Integer.MIN_VALUE;
		int count=0;
		for (int i = 0; i < a.length; i++) {
			int countd=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=visit;
					countd++;
				}
			}
			
			if (a[i]!=visit && countd==1 & isPrime(a[i])) {
				count++;
			}
		}
		if (count==0) {
			System.out.println();
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