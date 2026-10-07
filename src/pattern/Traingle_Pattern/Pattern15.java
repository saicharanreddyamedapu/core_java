// 4 3 2 1
// 3 2 1
// 2 1
// 1
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    
    for (int i = row; i >= 1; i--) {
      int n= 0+i;
      for (int j = 1; j <= i; j++) {
        System.out.print(n-- + " ");
      }
      System.out.println();
    }

    // char ch1= 'd';
    // for(int i = row; i >= 1; i--) {
    // char ch=ch1;
    // for(int j = 1; j <= i; j++) {
    // System.out.print(ch-- + " ");

    // }
    // ch1--;
    // System.out.println();
    // }
  }

  
  
}
