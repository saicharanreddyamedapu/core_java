//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 

package pattern.Pascal_Traingle;

import java.util.Scanner;

public class Pattern9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= row-1;
    int star = 1;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }

      int n =1;
      for(int k = 1; k <= star; k++){
        System.out.print(n + " ");
        n = n*(i-k) /k;
      }
      space--;
      star++;
      System.out.println();
    }
  }
  
}
