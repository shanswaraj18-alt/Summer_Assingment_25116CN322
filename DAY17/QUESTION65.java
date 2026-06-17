//WAP to merge array
package DAY17;
import java.util.Arrays;
public class QUESTION65 {
   public static void main(String[] args) {
    int[] arr1={1,2,3,4,5,6};
    int[] arr2={7,8,9,10};
    int n=arr1.length;
    int m= arr2.length;
    int[] result =new int[n+m];
    //merge arr1 and arr2
    for(int i=0;i<n;i++){
        result[i] =arr1[i];
    }
    for(int i=0;i<m;i++){
        result[n+i]=arr2[i];
    }
    System.out.println("merge array is:"+Arrays.toString(result));
   }
    
}
