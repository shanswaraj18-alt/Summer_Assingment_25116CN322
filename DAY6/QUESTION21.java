//WAP to covert decimal to binary
package DAY6;
import java.util.Scanner;
public class QUESTION21 {
    public static void main(String[] args) {
        System.out.println("enter decimal no.");
        Scanner Sc = new Scanner(System.in);
        int num=Sc.nextInt();
        String binary="";
        if(num==0){
        binary="0";
        }
        else
            {while(num>0){
            binary += num%2;
            num=num/2;
        }}
        System.out.println("binary no. is:"+binary);
        Sc.close();
    }
    
}
