//write a program to write function for perfect no.
package DAY12;
import java.util.Scanner;
public class QUESTION48 {
    static int  perfectNum(int num){
        int sum =0;
        int firstFactor=0;
        int secFactor=0;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
             firstFactor +=i;
            secFactor +=num/i; 
           }
        }
           sum = firstFactor+secFactor+1;
        
    return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner Sc = new Scanner(System.in);
        int num =Sc.nextInt();
        int temp=perfectNum(num);        
        if(temp==num){
            System.out.println("entersd no. is perfect no.");
        }
        else{
            System.out.println("enterd no. is not perfect no.");
        }
        Sc.close();
    }
    
}
