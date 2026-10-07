// *       * 
// *       * 
// *       * 
// *       * 
// * * * * * 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern19 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
       if( j == 1 ||i == col ||j == col)
        System.out.print("*" + " ");
       else
        System.out.print(" " + " ");
      }
      System.out.println();
    }
  }
}


