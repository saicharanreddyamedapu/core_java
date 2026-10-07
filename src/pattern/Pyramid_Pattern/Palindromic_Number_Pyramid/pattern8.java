// Palindromic_Number_Pyramid

//     1 
//   1 2 1 
// 1 2 3 2 1

package pattern.Pyramid_Pattern.Palindromic_Number_Pyramid;

import java.util.Scanner;

public class pattern8 {
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

      int n=1;
      for(int k = 1; k <= star; k++){
        if(k <=star/2)
           System.out.print(n++ + " ");
        else
           System.out.print(n-- + " ");
          
      }

      
      space--;
      star+=2;
      System.out.println();
    }
  }
  
}
