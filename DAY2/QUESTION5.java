//WAP TO find sum of digit of no.
package DAY2;
import java.util.Scanner;
public class QUESTION5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number to find sum of its digit");
        int num = Sc.nextInt();
        int sum =0;
        while(num>0){
            int last_dgt=num%10;
            sum += last_dgt;
            num =num/10; 
        }
        System.out.println(sum);
    }
    
}
