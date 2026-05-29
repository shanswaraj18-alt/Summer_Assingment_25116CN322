//WAP to reverse a no.
package DAY2;
import java.util.Scanner;
public class QUESTION6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a no. to reverse");
        int num = Sc.nextInt();
        int reverse =0;
        while (num>0) {
           int last_dgt=num%10;
            reverse = reverse*10 + last_dgt;
            num=num/10;
              }
              System.out.println("reverse of entered no.is");
              System.out.println(reverse);
    }
    
}
