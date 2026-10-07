// 1 a 2 b 
// 3 c 4 d 
// 5 e 6 f 
// 7 g 8 h 
package pattern.Rectangle_Square;
import java.util.Scanner;
class Pattern11 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row Value");
    int row = sc.nextInt();
    System.out.println("Enter the column value");
    int col = sc.nextInt();
    int n = 1;
    char ch ='a';
    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= col; j++){
       if(j % 2==0){
        System.out.print(ch +" ");
        ch++;
       }
       else{
        System.out.print(n + " ");
        n++;
       }
      }
      
      System.out.println();
      // ch++;
    }
  }
  
}


