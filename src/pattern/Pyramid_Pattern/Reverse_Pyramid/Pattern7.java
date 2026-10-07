// e d c b a 
//   e d c 
//     e 
package pattern.Pyramid_Pattern.Reverse_Pyramid;

import java.util.Scanner;

public class Pattern7 {
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

      char ch = (char)(96 + (row * 2)-1);
      for(int k = star; k >= 1; k--){
       
           System.out.print(ch-- + " ");
      }   
      space++;
      star-=2;
      System.out.println();
    }
  }
  
}
