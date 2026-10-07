// 0 * * * 0 
// * *   * * 
// *   0   * 
// * *   * * 
// 0 * * * 0 
package pattern.Rectangle_Square;

import java.util.Scanner;

class Pattern45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row Value");
        int row = sc.nextInt();
        System.out.println("Enter the column value");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i == j && i != 1 && i != row && i != row / 2 + 1)
                        || (i + j == row + 1 && i != 1 && i != row && i != row / 2 + 1)
                        || (i == 1 && j != 1 && j != col)
                        || (j == 1 && i != 1 && i != row)
                        || (i == row && j != 1 && j != col)
                        || (j == col && i != 1 && i != row)) {
                    System.out.print("*" + " ");
                } else if ((i == row / 2 + 1 && j == col / 2 + 1)
                        || (i == 1 && j == 1)
                        || (i == 1 && j == col)
                        || (i == row && j == 1)
                        || (i == row && j == col)) {
                    System.out.print("0" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

}
