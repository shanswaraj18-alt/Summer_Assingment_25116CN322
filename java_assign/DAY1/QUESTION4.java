//to count digit in a no.
package DAY1;
import java.util.Scanner;
public class QUESTION4 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter no. to count digit");
        int num = Sc.nextInt();
        int count =0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("no. of digits in entered no." + count);
        
    }
    
}
