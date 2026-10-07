//     a 
//   a b c 
// a b c d e 
package pattern.Pyramid_Pattern;

import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= row-1;
    int star = 1;
    
    for (int i = 1; i <= row; i++) {
      char ch = 'a';
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for(int j = 1; j <= star; j++){
        System.out.print( ch++ + " ");
      }
      space--;
      star+=2;
      System.out.println();
    }
  }
  
}
