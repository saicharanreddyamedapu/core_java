// a b c d e 
//   a b c 
//     a 
//   a b c 
// a b c d e 
package pattern.Sand_Glass_Pattern;

import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= 0;
    int star = row;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      char ch = 'a';
      for(int k = 1; k <= star; k++){
        System.out.print(ch++ + " ");
      }
      if(i <= row/2){
        space++;
        star-=2;
      }
      else{
        space--;
        star+=2;
      }
      
      System.out.println();
    }
  }
  
}
