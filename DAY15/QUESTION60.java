//WAP to move zeroes to end
package DAY15;
import java.util.Arrays;
public class QUESTION60 {
    public static void main(String[] args) {
        int[] arr={1,3,0,7,0,5,0,0,4,6};
        int n= arr.length;
        int[] arr1 =new int[n];
        int count=0;
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
            if(arr[i]!=0){
             arr1[a]=arr[i];
             a++;
            }
        }
        for(int i=n-count;i<n;i++){
            arr1[i]=0;
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}
