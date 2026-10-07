package pattern.Alphabet_Pattern;

import java.util.Scanner;

public class PatternU {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Value...");
        int row = sc.nextInt();

        System.out.println("Enter Column Value...");
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= col; j++) {

                if((j==1 && i!=row) ||
                        (j==col && i!=row) ||
                        (i==row && j!=1 && j!=col))
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
