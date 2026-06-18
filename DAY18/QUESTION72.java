//WAP to sort array in descending order
package DAY18;
import java.util.Arrays;
public class QUESTION72 {
    public static void main(String[] args) {
        int[] arr={34,78,69,56,46,89};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max =i;
        for(int j=i+1;j<n;j++){
            if(arr[max]<arr[j]){
                int temp =arr[j];
                arr[j]=arr[max];
                arr[max] =temp;
            }

        }
        }
        System.out.println("sorted array in descending order"+Arrays.toString(arr));
}
}
