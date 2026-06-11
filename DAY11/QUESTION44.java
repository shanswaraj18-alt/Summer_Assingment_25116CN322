//WAP to write function to write factorial
package DAY11;
import java.util.Scanner;
public class QUESTION44 {
        static int factorial(int num){
            if(num==0||num==1){
                return 1;
            }
            return num*factorial(num-1);  
        }
    public static void main(String[] args) {
        System.out.println("enter no to find factorial");
        Scanner Sc = new Scanner(System.in);
        int num= Sc.nextInt();
        System.out.println(factorial(num));
        Sc.close();
    }
    }
    

