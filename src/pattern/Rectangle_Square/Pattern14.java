// 1 0 1 0 
// 0 1 0 1 
// 1 0 1 0 
// 0 1 0 1 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern14 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
       if((i+j) % 2 == 0)
        System.out.print("1" + " ");
       else
        System.out.print("0" + " ");
      }
      System.out.println();
    }
  }
}


