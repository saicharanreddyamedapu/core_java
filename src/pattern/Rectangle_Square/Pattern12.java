// 1 a 2 b 3 
// 1 a 2 b 3 
// 1 a 2 b 3 
// 1 a 2 b 3 
// 1 a 2 b 3 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    
    for(int i = 1; i <= row; i++){
      int n = 1;
     char ch ='a'; 
      for(int j = 1; j <= col; j++){
       if(j % 2==0){
        System.out.print(ch++ +" ");
      
       }
       else{
        System.out.print(n++ + " ");
      
       }
      }
      
      System.out.println();
      // ch++;
    }
  }
  
}


