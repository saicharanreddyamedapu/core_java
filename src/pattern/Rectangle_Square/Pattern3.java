// @ * @ * @ 
// @ * @ * @ 
// @ * @ * @ 
// @ * @ * @ 
// @ * @ * @ 
package pattern.Rectangle_Square;

import java.util.Scanner;
class Pattern3 {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("ENter the row value");
    int row = sc.nextInt();
    System.out.println("Enter the col Value");
    int col = sc.nextInt();

    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
        if(j % 2 == 0)
          System.out.print("*" + " ");
        else
          System.out.print("@" + " ");
      }
      System.out.println();
    }
  }
  
}
