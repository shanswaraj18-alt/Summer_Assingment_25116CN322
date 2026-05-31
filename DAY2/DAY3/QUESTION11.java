//WAP to find gcd of a no.
package DAY2.DAY3;
import java.util.Scanner;
public class QUESTION11{
static int GCD(int a,int b){
    while(b!=0){
    int temp = b;
    b=a%b;
    a= temp;
}
    return a;

}

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = Sc.nextInt();
        System.out.println("enter num2");
        int num2 = Sc.nextInt();
        System.out.println(GCD(num1,num2));
    }
    
}
