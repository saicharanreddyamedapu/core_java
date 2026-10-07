// 1 0 1 0 1 
//   1 0 1 
//     $ 
//   A 1 A 
// A 1 A 1 A 
package pattern.Sand_Glass_Pattern.Adv_Sand_Glass;
import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= 0;
    int star = row;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      char ch = 'a';
      for(int k = 1; k <= star; k++){
        if(i <= row/2){
          if(k % 2 == 0)
            System.out.print("0 ");
          else
            System.out.print("1 ");
        }
        else if(i == row/2+1)
          System.out.print("$ ");
        else
          if(k % 2 == 0)
            System.out.print("1 ");
          else
            System.out.print("A ");
      }
      if(i <= row/2){
        space++;
        star-=2;
      }
      else{
        space--;
        star+=2;
      }
      
      System.out.println();
    }
  }
  
}
