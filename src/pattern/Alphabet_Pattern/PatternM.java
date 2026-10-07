package pattern.Alphabet_Pattern;

import java.util.Scanner;

public class PatternM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row Value...");
        int row = sc.nextInt();

        System.out.println("Enter Column Value...");
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= col; j++) {

                if((j==1) ||
                        (j==col) ||
                        (i==j && j<=col/2+1) ||
                        (i+j==col+1 && j>=col/2+1))
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
