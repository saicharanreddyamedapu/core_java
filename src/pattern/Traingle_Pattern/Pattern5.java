// a 
// b c 
// d e f 
// g h i j 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Value...");
        int row = sc.nextInt();
        char ch = 'a';
        for(int i = 1; i <= row; i++) {       
            for(int j = 1; j <= i; j++) {         
               System.out.print(ch++ + " ");     
            }
            System.out.println();
        }
    }
  
}
