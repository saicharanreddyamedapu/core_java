//     1 
//   1 0 
// 1 0 1 
//   1 0 
//     1 
package pattern.Diamond.Half_Diamondd;

import java.util.Scanner;

public class Pattern6 {
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
        if(k % 2 ==0)
          System.out.print("0 ");
        else
          System.out.print("1 ");
      

      }
      if(i <= row/2){
        star++;
        space--;
      }
      else{
        star--;
        space++;
      }
      System.out.println();
    }
  }
  
}
