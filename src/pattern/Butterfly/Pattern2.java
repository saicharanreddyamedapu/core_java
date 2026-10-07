// 1             1 
// 1 2         2 1 
// 1 2 3     3 2 1 
// 1 2 3 4 4 3 2 1 
// 1 2 3     3 2 1 
// 1 2         2 1 
// 1             1 
package pattern.Butterfly;

import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    int space= row - 1;
    int star = 1;
    for (int i = 1; i <= row; i++) {
      int n = 1;
      
      for(int j = 1 ; j <= star; j++){
          System.out.print(n++ + " ");
      }

      for (int k = 1; k <= space; k++) {
        System.out.print("  ");
      }

      int m = star;
      for(int l = 1; l <= star; l++){
        System.out.print(m-- + " ");
      }

      if(i<=row/2){
        star++;
        space -= 2;
      }else{
        star--;
      space += 2;
      }
      
      
      
      System.out.println();
    }
  }
  
}
