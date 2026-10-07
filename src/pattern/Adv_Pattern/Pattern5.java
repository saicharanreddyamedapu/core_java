// a b 
//   c d e 
//     f g h i
package pattern.Adv_Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 2;
    int space = 0;
    char ch = 'a';
    
    
    for (int i = 1; i <= row; i++) {
      for(int j = 1; j <= space; j++){
        System.out.print("  ");
      }     
      
      for(int k = 1; k <= star; k++){
        System.out.print(ch++ + " ");
      }
      space++;
      star++;
      System.out.println();
    }
  }
    
}
