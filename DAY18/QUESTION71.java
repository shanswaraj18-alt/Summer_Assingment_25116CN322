//wap to binary search
package DAY18;
import java.util.Scanner;
public class QUESTION71 {
    public static void main(String[] args) {
        int[] arr ={1,4,3,7,5,6,9};
        System.out.println("enter target to found in array: ");
        Scanner Sc = new Scanner(System.in);
        int target =Sc.nextInt();
        int result =binarySearch(arr, target);
        if(result==-1){
            System.out.println("target not found");
        }else{
        System.out.println("target found at index in array: "+ result);
    }
        Sc.close();
    }
    static int binarySearch(int[] arr,int target){    
        int i=0;
        int n=arr.length;
        int j= n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                j=mid-1;
            }else{
                i=mid +1;
            }
        }
    return -1;    
    
}
    
}
