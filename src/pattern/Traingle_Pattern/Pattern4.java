// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 

package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern4 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Value...");
        int row = sc.nextInt();
        int n = 1;
        for(int i = 1; i <= row; i++) {         
            for(int j = 1; j <= i; j++) {         
               System.out.print(n++ + " ");
            }
            System.out.println();
        }
    }
  
}
