//WAP for selection sort
package DAY18;
import java.util.Arrays;
public class QUESTION70 {
    public static void main(String[] args) {
        int[] arr={1,4,3,7,6,5,9};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[min];
                    arr[min]=temp;
                }
            }
        }
        System.out.println("sorted array:"+Arrays.toString(arr));
    }
    
}
