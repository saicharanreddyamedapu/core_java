// 1 
// 0 1 
// 0 1 0 
// 1 0 1 0 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern8 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Value...");
        int row = sc.nextInt();
        int step =1;
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {  
              if(step % 2==0)
                System.out.print(0 + " ");
              else
                System.out.print(1 + " ");   
              step++;
            }
            System.out.println();
        }
    }
  
}
