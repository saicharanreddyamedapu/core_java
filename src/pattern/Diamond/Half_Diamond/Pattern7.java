// a 
// b c 
// d e f 
// g h 
// i 
package pattern.Diamond.Half_Diamond;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int star = 1;
    char ch = 'a';
    
    for (int i = 1; i <= row; i++) {
      for(int k = 1; k <= star; k++){
        System.out.print(ch++ + " ");
      }
      if(i <= row/2){
        star++;
      }
      else{
        star--;
      }
      System.out.println();
    }
  }
}
