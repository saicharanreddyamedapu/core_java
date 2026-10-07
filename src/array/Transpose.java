package array;


public class Transpose {
	public static void main(String[] args) {
		int[][] a= {{12,13,15},{22,8,3}};
 		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
