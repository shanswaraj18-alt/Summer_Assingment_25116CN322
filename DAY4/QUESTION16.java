//WAP to find all armstrong no. in a range
package DAY4;
import java.util.Scanner;
public class QUESTION16 {
    static void printArmstrong(int n){
        for (int num =0;num<=n;num++){
            int power =0;
            int sum =0 ;
            int temp=num;
            int original=num;
            while(temp>0){
            temp=temp/10;
            power++;
            }
            temp =num;
            while(temp>0){
            int lst_dgt =temp%10;
            sum+=(int)Math.pow(lst_dgt,power);
            temp=temp/10;
            }
           if(original==sum){
            System.out.println(num);
           }

        }
    }
    public static void main(String[] args) {
        System.out.println("enter the range upto find armstrong no.");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        printArmstrong(n);
    }
}
