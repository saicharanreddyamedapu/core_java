// a b c d e f g h i 
// a b     c     d e 
// a   b   c   d   e 
// a     b c d     e 
// a b c d e f g h i 
// a     b c d     e 
// a   b   c   d   e 
// a b     c     d e 
// a b c d e f g h i 
package pattern.Rectangle_Square;

import java.util.Scanner;

public class Pattern37 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    for(int i = 1; i <= row; i++){
      char ch = 'a';
      for(int j = 1; j <= col; j++){
       if( i==1||i==col||j==1||j==col ||i ==j || i + j == row+1||j == col/2+1||i == col/2+1)
        System.out.print(ch++ + " ");
       else
        System.out.print(" " + " ");
      }
      System.out.println();
    }
  }
  
}
