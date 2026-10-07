// d d d d 
// c c c 
// b b 
// a 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();
        char ch = 'd';
    for(int i= row; i>= 1; i--){
         for(int j = 1; j <= i; j++){
            System.out.print(ch + " ");
        }
        ch--;
        System.out.println();
    }
  }
  
}
