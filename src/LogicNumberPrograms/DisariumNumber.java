package LogicNumberPrograms;

import java.util.Scanner;

class DisariumNumber {
	public static int count(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		return count;

	}

	public static int exponential(int num, int power) {
		int exp = 1;
		for (int i = 1; i <= power; i++) {
			exp = exp * num;
		}
		return exp;
	}

	public static boolean disariumNumber(int num) {
		int count = count(num);
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int ld = num % 10;
			int exp = exponential(ld, count);
			sum = sum + exp;
			count--;
			num = num / 10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (disariumNumber(num))
			System.out.println(num + " is a Disarium Number");
		else
			System.out.println(num + " is not a Disarium Number");
	}
}
