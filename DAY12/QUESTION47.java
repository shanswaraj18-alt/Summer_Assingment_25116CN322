//WAP to write function for fibonacci
package DAY12;
import java.util.Scanner;
public class QUESTION47 {
    static int fibonacci(int num){
        if(num==0){
         return 0;
        }
        if(num==1){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        System.out.println("nth fibonacci term:");
        System.out.println(fibonacci(num));
        Sc.close();

    }
}
