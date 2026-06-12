//WAP to write function for armstrong
package DAY12;
import java.util.Scanner;
public class QUESTION46 {
    static int Armstrong(int num,int digits){
        if(num==0){
            return 0;
        }
        int lst_dgt =num%10;
        return (int)Math.pow( lst_dgt,digits)+Armstrong(num/10, digits);
    }
    public static void main(String[] args) {
        System.out.println("enter num to check armstrong");
        Scanner Sc =new Scanner(System.in);
        int num = Sc.nextInt();
        int digits =0;
        int temp =num;
        while(temp>0){
            digits++;
            temp=temp/10;
        }
         if (num==Armstrong(num, digits)){
            System.out.println("armstrong no.");
         }
        else{System.out.println("not armstrong");} 
        Sc.close();
    }
    
}
