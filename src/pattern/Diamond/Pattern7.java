//     1 
//   1 2 1 
// 1 2 3 2 1 
//   1 2 1 
//     1 
package pattern.Diamond;

import java.util.Scanner;

public class Pattern7 {
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
      int n = 1;
      for(int k = 1; k <= star; k++){
        if(k <= star/2)
          System.out.print(n++ + " ");
        else
          System.out.print(n-- + " ");
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
