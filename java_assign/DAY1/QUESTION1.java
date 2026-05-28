//sum of first n natural no.
package DAY1;
import java.util.Scanner;
public class QUESTION1 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        int n = Sc.nextInt(); 
        int sum=0;
        for(int i=0;i<=n;i++){
             sum +=i;
        }
        System.out.println(sum);
        Sc.close();
    }
    
}
