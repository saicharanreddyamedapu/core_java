//       d 
//     c d 
//   b c d 
// a b c d 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Value...");
        int row = sc.nextInt();
        for(int i = 1; i<=row; i++){
            char ch = 'a';
            for(int j = 1; j <= row; j++){
                if(i+j >= row+1)
                    System.out.print(ch++ + " ");
                else{
                    System.out.print("  ");
                    ch++;
                }
                    
            }
            System.out.println();
        }
    }
  
}
