// 1 
// 2 3 
// 4 5 6 
// 7 8 
// 9 
package pattern.Diamond.Half_Diamond;

import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 1;
    int n = 1;
    
    for (int i = 1; i <= row; i++) {
     

      
      for(int k = 1; k <= star; k++){
        System.out.print(n++ + " ");
      }
      if(i <= row/2){
        star++;
      }
      else{
        star--;
      }
      System.out.println();
    }
  }
  
}
