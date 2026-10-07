// d c b a
// c b a
// b a
// a
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
    
    for (int i = row; i >= 1; i--) {
      char ch= (char)(96+i);
      for (int j = 1; j <= i; j++) {
        System.out.print(ch-- + " ");
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
