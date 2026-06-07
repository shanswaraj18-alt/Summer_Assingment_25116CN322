//WAP to recursive reverse a no.
package DAY7;
import java.util.Scanner;
public class QUESTION28 {
    static int reverse =0;
    static int reverse(int n){
        
        if(n==0){
            return reverse;
        }
        else{
            reverse =reverse*10+(n%10);
            return reverse(n/10) ;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("enter no. to find reverse the digit");
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        System.out.println(reverse(n));
    }
}
