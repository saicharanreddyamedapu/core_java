// 1 2 3 4 
// a b c d 
// 1 2 3 4 
// a b c d
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern10 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      char ch ='a';
      for(int j = 1; j <= col; j++){
       if(i % 2==0){
        System.out.print(ch +" ");
        ch++;
       }
       else{
        System.out.print(j + " ");
       }
      }
      
      System.out.println();
    }
  }
  
}


