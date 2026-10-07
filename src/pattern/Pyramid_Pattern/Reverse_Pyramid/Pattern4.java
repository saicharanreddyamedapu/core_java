// 1 2 3 4 5 
//   1 2 3 
//     1 
package pattern.Pyramid_Pattern.Reverse_Pyramid;

import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= 0;
    int star = (row * 2)-1;
    
  
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for(int k = 1; k <= star; k++){
       
           System.out.print(k+ " ");
      }   
      space++;
      star-=2;
      System.out.println();
    }
  }
  
}
