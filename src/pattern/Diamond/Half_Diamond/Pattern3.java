// a 
// a b 
// a b c 
// a b c d 
// a b c 
// a b 
// a 
package pattern.Diamond.Half_Diamond;

import java.util.Scanner;

public class Pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 1;
    
    for (int i = 1; i <= row; i++) {
     

      char ch = 'a';
      for(int k = 1; k <= star; k++){
        System.out.print(ch++ + " ");
      }
      if(i <= row/2){
        star++;
      }
      else{
        star--;
      }
      System.out.println();
    }
  }
  
}
