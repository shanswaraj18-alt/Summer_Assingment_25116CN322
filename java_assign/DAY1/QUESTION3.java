//WAP to find factorial
package DAY1;
import java.util.Scanner;
public class QUESTION3 {
    public static void main(String[] args) {
        System.out.println("enter a no.to find factorial");
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        int factorial =1;
        for(int i =1;i<=n;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
    
}
