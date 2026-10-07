// Mirrored Number Pyramid

//       1 
//     2 1 2 
//   3 2 1 2 3 
// 4 3 2 1 2 3 4 
package pattern.Pyramid_Pattern.Mirrored_Number_Pyramid;

import java.util.Scanner;

public class Pattern10 {
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

      int n=i;
      for(int k = 1; k <= star; k++){
        if(k <=star/2)
           System.out.print(n-- + " ");
        else
           System.out.print(n++ + " ");
          
      }

      
      space--;
      star+=2;
      System.out.println();
    }
  }
  
}
