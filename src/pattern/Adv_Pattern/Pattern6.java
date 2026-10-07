// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
package pattern.Adv_Pattern;

import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    
    int space= row*2 -2;
    int star = 1;
    for (int i = 1; i <= row; i++) {
      
      for(int j = 1 ; j <= star; j++){
        System.out.print("* ");
      }

      for (int k = 1; k <= space; k++) {
        System.out.print("  ");
      }

      for(int l = 1; l <= star; l++){
        System.out.print("* ");
      }
      star++;
      space -= 2;
      
      
      System.out.println();
    }
  }
  
}
