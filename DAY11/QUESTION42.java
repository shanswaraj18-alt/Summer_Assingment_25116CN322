//WAP to write function to find maximum
package DAY11;
import java.util.Scanner;
public class QUESTION42 {
    static int maximum(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max =num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]=new int[100];
        System.out.println("enter values in the array:");
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<=5;i++){
        arr[i] =sc.nextInt();}
        System.out.println("maximum no.is:");
        System.out.println(maximum(arr));
        sc.close();
    }
}
