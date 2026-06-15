//WAP to rotate array left;
package DAY15;
import java.util.Arrays;
import java.util.Scanner;; 
public class QUESTION58 {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,6,7,8};
        //rotate arrayleft by d places
        System.out.println("enter no. of places to rotate the array left");
        Scanner Sc= new Scanner(System.in);
        int d =Sc.nextInt();
        int n =arr.length;
        d=d%n;
        while(d>0){
         int first=arr[0];
         for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
         }
         arr[n-1]= first;
         d--;
        }
      System.out.println("array rotated left by"+ d+" place is:"+Arrays.toString(arr));
      Sc.close();
    }
    
}
