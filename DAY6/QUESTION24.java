//WAP to find x^n without pow()
package DAY6;
import java.util.Scanner;
public class QUESTION24 {
    public static void main(String[] args) {
        int result =1;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter no. to find power ");
        int x =Sc.nextInt();
        System.out.println("enter power of that no.");
        int n = Sc.nextInt();
        for(int i =1;i<=n;i++){
            result*=x;
        }
        System.out.println("result equal to:"+result);
    }
}
