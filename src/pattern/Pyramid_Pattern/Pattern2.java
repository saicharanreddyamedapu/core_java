//     1 
//   1 2 3 
// 1 2 3 4 5 
package pattern.Pyramid_Pattern;

import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= row-1;
    int star = 1;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for(int j = 1; j <= star; j++){
        System.out.print( j+ " ");
      }
      space--;
      star+=2;
      System.out.println();
    }
  }
  
}
