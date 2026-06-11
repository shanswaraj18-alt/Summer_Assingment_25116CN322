//WAP to write function to check prime
package DAY11;
import java.util.Scanner;
public class QUESTION43 {
    static boolean ISPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
         if(num%i==0){
            return false;
         }
        }
        return true;
    } 
    public static void main(String[] args) {
        System.out.println("enter the no. to check");
        Scanner Sc = new Scanner(System.in);
        int num =Sc.nextInt();
        System.out.println(ISPrime(num));
        Sc.close();
    }
}
