//WAP to print factors of a no.
package DAY5;
import java.util.Scanner;
public class QUESTION19 {
    static void printFactor(int num){
        System.out.println("factors of given no.:");
        for(int i =1;i*i<=num;i++){
           if(num%i==0){
            int factor1 = i;
            int factor2= num/i ;
            System.out.println(factor1);
            System.out.println(factor2);
           }
        }
    }
    public static void main(String[] args) {
        System.out.println("enter no. to print factor");
        Scanner Sc = new Scanner(System.in);
        int num =Sc.nextInt();
        printFactor(num);
    }
    
}
