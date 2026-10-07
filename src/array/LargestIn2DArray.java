package array;

public class LargestIn2DArray {
	public static void main(String[] args) {
		int[][] a= {{12,13,15},{22,8,3}};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}	
