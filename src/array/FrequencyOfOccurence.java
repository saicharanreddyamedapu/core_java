package array;

public class FrequencyOfOccurence {

	public static void main(String[] args) {

		int a[]= {10,20,10,10,50,20,30,30,20,20,10,20,40};
		int visit=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[j]=visit;
					count++;
				}
			}
			
//			if (a[i]!=visit) {				
//				System.out.println(a[i]);
//			}
			if (a[i]!=visit) {
				System.out.println(a[i]+"-->"+count);
			}
		}
	}
}
