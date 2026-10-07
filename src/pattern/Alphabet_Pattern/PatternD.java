package pattern.Alphabet_Pattern;

import java.util.Scanner;

public class PatternD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Value...");
        int row = sc.nextInt();

        System.out.println("Enter Column Value...");
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= col; j++) {

                if((j == 1) ||
                        (i == 1 && j != col) ||
                        (i == row && j != col) ||
                        (j == col && i != 1 && i != row))
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}