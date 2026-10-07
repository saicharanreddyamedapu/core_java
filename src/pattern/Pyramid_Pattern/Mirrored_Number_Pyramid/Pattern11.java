//       a 
//     b a b 
//   c b a b c 
// d c b a b c d

package pattern.Pyramid_Pattern.Mirrored_Number_Pyramid;

import java.util.Scanner;

public class Pattern11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row Value...");
    int row = sc.nextInt();

    int space= row-1;
    int star = 1;
    
    
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      char ch = (char)(96+i);
      for(int k = 1; k <= star; k++){
        if(k <=star/2)
           System.out.print(ch-- + " ");
        else
           System.out.print(ch++ + " ");
          
      }

      
      space--;
      star+=2;
      System.out.println();
    }
  }
  
}
