//       1 
//     1 2 3 
//   1 2 3 4 5 
// 1 2 3 4 5 6 7 
//   1 2 3 4 5 
//     1 2 3 
//       1 
package pattern.Diamond;

import java.util.Scanner;

public class Pattern2 {
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
        System.out.print(k + " ");
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
