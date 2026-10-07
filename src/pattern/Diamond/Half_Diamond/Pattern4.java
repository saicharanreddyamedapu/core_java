// 1 
// a b 
// 1 2 3 
// a b 
// 1 
package pattern.Diamond.Half_Diamond;

import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 1;
    
    for (int i = 1; i <= row; i++) {
     

      char ch = 'a';
      for(int k = 1; k <= star; k++){
        if(i % 2 == 0)
          System.out.print(ch++ + " ");
        else
          System.out.print(k + " ");
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
