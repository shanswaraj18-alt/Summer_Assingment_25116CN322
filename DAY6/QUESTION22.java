//WAP to convert binary to decimal
package DAY6;
import java.util.Scanner;
public class QUESTION22 {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    String binary = Sc.next();
    int decimal =0;
    int power =0;
    int n = binary.length();
    for(int i=n-1;i>=0;i--){
        int digit =binary.charAt(i)-'0';
        decimal += digit*(int)Math.pow(2, power);
        power++;
    }
    System.out.println("decimal no. is:"+decimal);
    Sc.close();
}}
