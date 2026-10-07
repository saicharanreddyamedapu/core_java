// 1 
// a b 
// 1 2 3 
// a b c d 

package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    for(int i = 1; i <= row; i++) {
        char ch = 'a';
        int n = 1;
        for(int j = 1; j <= i; j++) { 
          if(i % 2 == 0)        
            System.out.print(ch++ + " ");
          else
            System.out.print(j + " ");
        }
            System.out.println();
    }
  }
  
}
