// 1 
// a b 
// 2 3 4 
// c d 
// 5 
package pattern.Diamond.Half_Diamond;

import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 1;
    char ch = 'a';
    int n = 1;
    
    for (int i = 1; i <= row; i++) {
     

      
      for(int k = 1; k <= star; k++){
        if(i % 2 == 0)
          System.out.print(ch++ + " ");
        else
          System.out.print(n++ + " ");
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
