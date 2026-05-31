//WAP to find LCM of two no.
package DAY3;
import java.util.Scanner;
public class QUESTION12 {
    static int GCD(int a,int b){
        while(b!=0){
        int temp = b;
        b=a%b;
        a=temp;    
        }
     return a;
    }
    public static void main(String[] args) {
    Scanner Sc =new Scanner(System.in);
    System.out.println("enter num1:");
        int num1 = Sc.nextInt();
    System.out.println("enter num2:");    
        int num2 = Sc.nextInt();
    int LCM = (num1*num2)/GCD(num1,num2) ;
    System.out.println("LCM IS :"+ LCM);

    }
}
