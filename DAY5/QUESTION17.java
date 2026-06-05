//WAP TO CHECK PERFECT NUMBER
package DAY5;
import java.util.Scanner;
public class QUESTION17 {
    static void checkPerfect(int num){
        int sum =1;
        for(int i=2;(i*i)<num;i++){
          if(num%i==0){
            int frst_factor=i;
            int scnd_factor=num/i;
            sum+= (frst_factor+scnd_factor);

          }
        }
        if (sum==num){
          System.out.println("entered no. is perfect no.");
        }
        else{
            System.out.println("entered no. is not perfect");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter no. to check perfect no.");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        checkPerfect(num);
    }
    
}
