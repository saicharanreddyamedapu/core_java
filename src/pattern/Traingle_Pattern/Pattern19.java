//       0 
//     1 0 
//   1 0 1 
// 0 1 0 1 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern19 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    int step = 0;
    
    for(int i = 1; i <= row; i++) {   
      for(int j = 1; j <= row; j++) {       
        if(i+j>= row+1)
          if(step % 2 == 0){
            System.out.print("0 ");
            step++;
       
          }   
          else{
            System.out.print("1 ");
            step++;
         
          }  
        else
          System.out.print("  ");
      }  
          System.out.println();
    }
  }
  
}
