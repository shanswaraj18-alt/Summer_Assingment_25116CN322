//WAP to find product of digit of no.
package DAY2;
import java.util.Scanner;
public class QUESTION7 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    int num = Sc.nextInt();
    int product=1;
    while(num>0){
        int lst_dgt = num%10;
        product*=lst_dgt;
        num =num/10;
    }
    System.out.println(product);
    
}
}