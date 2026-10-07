package array;

import java.util.Arrays;

public class Array2Sorts {
	public static void main(String[] args) {
		int b[] = { 3, 42, 53, 6, 32, 45, 66, 76, 3 };
		int mi = b.length / 2;
		for (int j = 0; j < mi; j++) {
			for (int i = 0; i <= mi; i++) {
				if (b[i] > b[i + 1]) {
					int temp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}
			}
		}
		System.out.println(mi);

		for (int j = mi + 1; j < b.length - 1; j++) {
			for (int i = mi + 1; i < b.length - 1; i++) {
				if (b[i] < b[i + 1]) {
					int temp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));

	}
}
