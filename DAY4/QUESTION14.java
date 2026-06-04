//WAP to find Nth fibonacci term
package DAY4;
import java.util.Scanner; 
public class QUESTION14 {
    public static void main(String[] args) {
        System.out.println(" terms in fibonacci series:");
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        int arr[]=new int[n] ;
        arr[0]=0;
        arr[1]=1;
        int a =0;
        int b =1;
        int next =1;
        for(int i=2;i<n;i++){
        arr[i]=next;
        a=b;
        b= next;
        next = a+b;
        }
        System.out.println("nth term in fibonacci series is:");
        System.out.println(arr[n-1]);

    }
}
