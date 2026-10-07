// * 
// * * 
// * * * 
// * * * * 
// * * * 
// * * 
// * 
package pattern.Diamond.Half_Diamond;

import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 1;
    
    for (int i = 1; i <= row; i++) {
     

      for(int k = 1; k <= star; k++){
        System.out.print("* ");
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
