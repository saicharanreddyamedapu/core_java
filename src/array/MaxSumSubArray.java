package array;

public class MaxSumSubArray {
	public static void main(String[] args) {
		int[] a= {2,-7,2,8,-3,7,6,-7,2,1};
		int maxsum=0,li=0,fi=0;
		for(int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = i; j < a.length; j++) {
				sum=sum+a[j];
				if (sum>maxsum) {
					maxsum=sum;
					li=j;
					fi=i;
				}
			}
		}
		System.out.println(maxsum+"-->"+fi+":"+li);
		for (int i = fi; i <=li; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
