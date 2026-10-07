// a a a a 
// b b b b 
// c c c c 
// d d d d 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    char ch ='a';
    for(int i = 1; i <= row; i++){
      
      for(int j = 1; j <= col; j++){
       System.out.print(ch + " ");
      }
      
      System.out.println();
      ch++;
    }
  }
  
}


