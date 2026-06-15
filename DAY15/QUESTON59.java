//WAP to rotate array right 
package DAY15;
import java.util.Arrays;
import java.util.Scanner;
public class QUESTON59 {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5,6,7};
        System.out.println("enter no. of places to rotate array right:");
        Scanner Sc =new Scanner(System.in);
        int d =Sc.nextInt();
        int n =arr.length;
        d=d%n;
        while(d>0){
            int last=arr[n-1];
            for(int i=0;i<n-1;i++){
            arr[n-i-1]=arr[n-i-2];}
            arr[0]=last;
            d--;
        }
        System.out.println("right rotated array by "+d+"place is"+Arrays.toString(arr));
        Sc.close();
    }
    
}
