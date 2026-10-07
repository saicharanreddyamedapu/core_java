// 1 2 
//   3 4 5 
//     6 7 8 9 
package pattern.Adv_Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 2;
    int space = 0;
    int n = 1;
    
    for (int i = 1; i <= row; i++) {
      for(int j = 1; j <= space; j++){
        System.out.print("  ");
      }     

      for(int k = 1; k <= star; k++){
        System.out.print(n++ + " ");
      }
      space++;
      star++;
      System.out.println();
    }
  }
    
}
