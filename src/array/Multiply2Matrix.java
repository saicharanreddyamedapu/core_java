package array;

public class Multiply2Matrix {
	public static void main(String[] args) {
		int[][] a= {{6,4},
					{4,8}};
		int[][] b= {{2,3},
					{2,8}};
		
		
		
		
		
		for (int i = 0; i < b.length; i++) {
			int sum=0;
			for (int j = 0; j < b[i].length; j++) {
				sum=a[i][j]*b[i][j];
				
				for (int k = 0; k < b[j].length; k++) {
//					sum=sum+a[i][j]*b[index][0];
					System.out.print(a[i][j]+" "+ b[j][k]+" ");
				}
				System.out.println(sum);
			}
			
//			System.out.println(sum);
		}
	}
}
