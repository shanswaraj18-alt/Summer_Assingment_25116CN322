//WAP to check armstrong no.
package DAY4;
import java.util.Scanner;
public class QUESTION15 {
    static boolean armstrong(int n){
        int power =0;
        int original = n;
        int sum =0;
        int temp = n;
        while( temp>0){
            temp=temp/10;
            power++;
            }
        temp =n;    
        while(temp>0){
            int lst_dgt=temp%10;
            sum+=(int)Math.pow(lst_dgt,power);
            temp=temp/10;
        }   
    if(sum==original){
        System.out.println("ARMSTRONG");
        return true;
    }
    else{
        System.out.println("NOT ARMSTRONG");
        return false;
    }
    }
    public static void main(String[] args) {
        System.out.println("enter the no. to check armstrong");
        Scanner Sc = new Scanner(System.in);
        int num =Sc.nextInt();
        armstrong(num);

    }
}
