// 1 2 3 4 5 6 7 8 9 
// 1 2     3     4 5 
// 1   2   3   4   5 
// 1     2 3 4     5 
// 1 2 3 4 5 6 7 8 9 
// 1     2 3 4     5 
// 1   2   3   4   5 
// 1 2     3     4 5 
// 1 2 3 4 5 6 7 8 9 
package pattern.Rectangle_Square;

import java.util.Scanner;

public class Pattern36 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    for(int i = 1; i <= row; i++){
      int n = 1;
      for(int j = 1; j <= col; j++){
       if( i==1||i==col||j==1||j==col ||i ==j || i + j == row+1||j == col/2+1||i == col/2+1)
        System.out.print(n++ + " ");
       else
        System.out.print(" " + " ");
      }
      System.out.println();
    }
  }
  
}
