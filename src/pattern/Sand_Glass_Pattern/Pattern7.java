// c b a b c 
//   c b c 
//     c 
//   c b c 
// c b a b c 
package pattern.Sand_Glass_Pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= 0;
    int star = row;
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }
      char ch = (char)(97 + row/2);
      for(int k = 1; k <= star; k++){
        if(k <= star/2)
          System.out.print(ch-- + " ");
        else
          System.out.print(ch++ + " ");
      }
      if(i <= row/2){
        space++;
        star-=2;
      }
      else{
        space--;
        star+=2;
      }
      System.out.println();
    }
  }
  
}
