package array;

public class Add2Matrix {
	public static void main(String[] args) {
		int[][] a= {{12,13,15},{22,8,3}};
		int[][] b= {{12,13,15},{22,8,3}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
