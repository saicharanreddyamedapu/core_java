package array;

public class DistinctElements {

	public static void main(String[] args) {
		int a[]= {10,10,10,20,20,30,30,30};
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			int count=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]==temp) {
					System.out.println(a[i]);
					break;
				}
				if(count>0) {
					System.out.println(a[i]);
				}
				
			}
		}
	}

}
