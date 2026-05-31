//WAP to print all prime no. in given range 
package DAY3;
import java.util.Scanner;
public class QUESTION10 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number to find prime no. up to enterd no. ");
        int num = Sc.nextInt();
        System.out.println("all the prime no. in given range is");
        boolean flag =true;
        for(int i=2;i<=num;i++){
            int temp =i;
            for(int j=2;j<=Math.sqrt(temp);j++){
                if(temp %j==0){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
        if(flag==true){
            System.out.println(temp);
        }
    }
    }
    
}
