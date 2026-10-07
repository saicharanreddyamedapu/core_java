// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
package pattern.Rectangle_Square;

import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row value..");
    int row = sc.nextInt();
    System.out.println("Enter the col value");
    int col = sc.nextInt();

    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    
  }
  
}
