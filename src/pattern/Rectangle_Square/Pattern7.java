// 1 1 1 1 
// 2 2 2 2 
// 3 3 3 3 
// 4 4 4 4 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern7 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
       System.out.print(i + " ");
      }
      System.out.println();
    }
  }
  
}


