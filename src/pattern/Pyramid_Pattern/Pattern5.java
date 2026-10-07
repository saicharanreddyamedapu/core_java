//     1 
//   0 1 0 
// 1 0 1 0 1 
package pattern.Pyramid_Pattern;

import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= row-1;
    int star = 1;
    int step=1;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for(int j = 1; j <= star; j++){
        if(step % 2 == 0)
           System.out.print(0 + " ");
        else
           System.out.print(1 + " ");
          step++;
      }

      
      space--;
      star+=2;
      System.out.println();
    }
  }
  
}
