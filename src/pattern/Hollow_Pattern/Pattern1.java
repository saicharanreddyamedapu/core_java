//     * 
//   *   * 
// *       * 
//   *   * 
//     * 
package pattern.Hollow_Pattern;
import java.util.Scanner;

public class Pattern1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= row/2;
    int star = 1;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      for(int k = 1; k <= star; k++){
        if(k == 1 || k == star)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      if(i <= row/2){
        space--;
        star+=2;
      }
      else{
        space++;
        star-=2;
      }
      System.out.println();
    }
  }
  
}
