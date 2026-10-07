// 3 2 1 2 3 
//   2 1 2 
//     1 
package pattern.Pyramid_Pattern.Reverse_Pyramid;

import java.util.Scanner;

public class Pattern10 {
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
      int n = star/2+1;

      // char ch = (char)(96 + (row * 2)-1);
      for(int k = star; k >= 1; k--){
        // System.out.println(k+ "  " + star/2);
        if(k-1 > star/2){
          System.out.print(n-- + " ");
        }
        else
          System.out.print(n++ + " ");
        

       
      }   
      space++;
      star-=2;
      System.out.println();
    }
  }
  
}
