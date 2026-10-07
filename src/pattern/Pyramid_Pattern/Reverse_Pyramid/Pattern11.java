// c b a b c 
//   b a b 
//     a 
package pattern.Pyramid_Pattern.Reverse_Pyramid;

import java.util.Scanner;

public class Pattern11 {
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

      char ch = (char)(97 + star/2);
      for(int k = star; k >= 1; k--){
        // System.out.println(k+ "  " + star/2);
        if(k-1 > star/2){
          System.out.print(ch-- + " ");
        }
        else
          System.out.print(ch++ + " ");
        

       
      }   
      space++;
      star-=2;
      System.out.println();
    }
  }
  
}
