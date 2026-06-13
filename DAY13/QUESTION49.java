//WAP to input and display array
package DAY13;
import java.util.Scanner;
public class QUESTION49 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n= Sc.nextInt();
        int[] arr =new int[n];
        System.out.println("input elements in array");
        for(int i=0;i<n;i++){
         arr[i] =Sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("display of element at"+i+" "+ arr[i]);
        }
        Sc.close();
    }
    
}
