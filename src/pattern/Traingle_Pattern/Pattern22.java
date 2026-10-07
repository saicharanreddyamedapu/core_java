
// 4 4 4 4 
//   3 3 3 
//     2 2 
//       1 
package pattern.Traingle_Pattern;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Value...");
        int row = sc.nextInt();
        
        for(int i = 1; i <= row; i++) {
            int n = row;
            for(int j = 1; j <= row; j++) { 
              if(i<=j)
                System.out.print(row+1-i  + " ");
              else
                System.out.print("  ");
            }
            n--;
            System.out.println();
        }
    }
  
}
