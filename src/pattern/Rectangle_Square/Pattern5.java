// a b c d 
// e f g h 
// i j k l 
// m n o p 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern5 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    char n= 'a';
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
       System.out.print(n + " ");
       n++;
      }
      System.out.println();
    }
  }
  
}


