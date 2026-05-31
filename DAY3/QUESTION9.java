//WAP to check whether the no. is prime
package DAY3;
import java.util.Scanner;
public class QUESTION9 {
    public static void main(String[] args) {
    Scanner Sc =new Scanner(System.in);
    System.out.println("enter number to check prime or not:");
    int num = Sc.nextInt();
    boolean IsPrime = true;
    if(num<=1){
        IsPrime = false;
    }
    for(int i=2;i<=Math.sqrt(num);i++){
     if(num%i!=0){
        IsPrime = true;
     }
     else{
        IsPrime=false;
     }
    }
    System.out.println(IsPrime);
}
    
}