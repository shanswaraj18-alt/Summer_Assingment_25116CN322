//WAP to bubble sort
package DAY18;
import java.util.Arrays;
public class QUESTION69 {
    public static void main(String[] args) {
        int[] arr ={1,4,3,6,8,7,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
