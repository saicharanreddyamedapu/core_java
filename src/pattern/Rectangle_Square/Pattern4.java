// 1 2 3 
// 4 5 6 
// 7 8 9 

package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern4 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    int n= 1;
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
       System.out.print(n + " ");
       n++;
      }
      System.out.println();
    }
  }
  
}
