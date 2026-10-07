//       1 
//     A 1 
//   A 1 A 
// 1 A 1 A 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    int step = 1;
    
    for(int i = 1; i <= row; i++) {   
      for(int j = 1; j <= row; j++) {       
        if(i+j>= row+1)
          if(step % 2 == 0){
            System.out.print("A ");
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
