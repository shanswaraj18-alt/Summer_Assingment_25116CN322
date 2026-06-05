//WAP to find largest prime factor
package DAY5;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class QUESTION20 {
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void largestPF(int num){
        List<Integer> list1 = new ArrayList<>();
        for(int i=3;i*i<=num;i++){
          if(num%i==0){
            int factor1=i;
            int factor2=num/i;
            if(isPrime(factor1)){
               list1.add(factor1);
            }
            if(isPrime(factor2)){
                list1.add(factor2);
            }
            }
          }
        Collections.sort(list1);
        int n = list1.size();
        System.out.println(list1.get(n-1));

    }
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner Sc = new Scanner(System.in);
        int num =Sc.nextInt();
        largestPF(num);
    
    Sc.close();
}}
