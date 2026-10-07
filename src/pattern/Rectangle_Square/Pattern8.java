// a b c d 
// a b c d 
// a b c d 
// a b c d 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern8 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    for(int i = 1; i <= row; i++){
      char ch ='a';
      for(int j = 1; j <= col; j++){
       System.out.print(ch + " ");
       ch++;
      }
      System.out.println();
    }
  }
  
}


