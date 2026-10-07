package array;

public class SumOfElements {
	public static void main(String[] args) {
		int a[]= {12,18,22,31,56};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
