// d d d d 
//   c c c 
//     b b 
//       a 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern23 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Value...");
        int row = sc.nextInt();
        
        char ch = 'd';
        for(int i = 1; i <= row; i++) {
            

            for(int j = 1; j <= row; j++) { 
              if(i<=j)
                System.out.print(ch  + " ");
              else
                System.out.print("  ");
            }
            ch--;
            System.out.println();
        }
    }
  
}
