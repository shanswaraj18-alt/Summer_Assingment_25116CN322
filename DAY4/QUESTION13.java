//fibonacci series
package DAY4;
import java.util.Scanner;
public class QUESTION13 {
    static void fibonacci(int n){
        int a =0;
        System.out.println(a);
        int b =1;
        System.out.println(b); 
        int next =1;
        for(int i=1;i<n-1;i++){
            System.out.println(next);
             a =b;
             b=next;
            next = a+b;
            
        }
        
    }
public static void main(String[] args) {
    System.out.println("enter the range upto find fibonacci series");
    Scanner Sc = new Scanner(System.in);
    int n =Sc.nextInt();
    System.out.println("the fibonnaci series is:");
    fibonacci(n);

}    
}
