//  a a a a a 
//   b b b 
//     c 
package pattern.Pyramid_Pattern.Reverse_Pyramid;

import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= 0;
    int star = (row * 2)-1;
    
    char ch = 'a';
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for(int k = 1; k <= star; k++){
       
           System.out.print(ch+ " ");
      }   
      ch++;        
      space++;
      star-=2;
      System.out.println();
    }
  }
  
}
