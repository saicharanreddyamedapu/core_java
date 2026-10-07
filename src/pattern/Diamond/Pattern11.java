//     1 
//   A 1 A 
// 1 A 1 A 1 
//   A 1 A 
//     1 
package pattern.Diamond;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    int space= row/2;
    int star = 1; 
    int step = 1;  
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }
      for(int k = 1; k <= star; k++){
        if(step % 2 == 0)
          System.out.print( "A ");
        else
          System.out.print(1 + " ");
        step++;
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
