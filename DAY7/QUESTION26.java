//wAP to recursive fibonacci
package DAY7;
import java.util.Scanner;
public class QUESTION26 {
    static int fibonacci(int n){
        if(n<=1){
         return n;
        }
        else{ 
            return fibonacci(n-1)+fibonacci(n-2);
        }
 }  
 public static void main(String[] args) {
    System.out.println("enter no. to find fibonacci");
    Scanner Sc = new Scanner(System.in);
    int n =Sc.nextInt();
    System.out.println(fibonacci(n));
 }
}