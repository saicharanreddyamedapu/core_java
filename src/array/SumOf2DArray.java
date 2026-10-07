package array;

public class SumOf2DArray {
	public static void main(String[] args) {
		int[][] a= {{12,13,15},
					{22,8,3},
					{13,2,5}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
//			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
				if (i==j) {					
				sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
