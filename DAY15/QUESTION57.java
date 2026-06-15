//WAP to reverse array
package DAY15;
import java.util.Scanner;
import java.util.Arrays;
public class QUESTION57 {
    public static void main(String[] args) {
        System.out.println("enter no. of elements in the array:");
        Scanner Sc = new Scanner(System.in);
        int n =Sc.nextInt();
        System.out.println("enter elements in array");
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =Sc.nextInt();
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[n-1-i]=arr[i];
        }
        System.out.println("reverse array is:"+ Arrays.toString(ans));
        Sc.close();
    }
    
}
