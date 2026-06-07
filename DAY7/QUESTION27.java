//WAP to find recursive sum of digit
package DAY7;
import java.util.Scanner;
public class QUESTION27 {
    static int sumOfDigit(int n){
        int sum=0;
        if(n<=0){
        return 0;
        }
        else{
           int lstdgt=n%10;
            sum += lstdgt;
            return sumOfDigit(n/10)+ sum;
    }
}
    public static void main(String[] args) {
        System.out.println("enter no. to find sum of it digit");
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        System.out.println(sumOfDigit(n));
    }
}