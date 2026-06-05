//WAP to check strong no.
package DAY5;
import java.util.Scanner;
public class QUESTION18 {
    static boolean checkStrong(int num){
        int temp =num;
        int sum =0;
        while(temp>0){
            int factorial =1;
           int lst_dgt = temp%10; 
           for(int i=1;i<=lst_dgt;i++){
            factorial*=i;
             }
        sum +=factorial;
        temp=temp/10;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println("enter no. to check strong or not");
        Scanner Sc =new Scanner(System.in);
        int num = Sc.nextInt();
        System.out.println(checkStrong(num));
    }}
