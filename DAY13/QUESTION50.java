//WAP to find sum and average of array
package DAY13;
public class QUESTION50 {
    public static void main(String[] args) {
       int[] arr ={1,2,4,5,6};
       int n= arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
         sum+=arr[i];
       }
      float average =sum/n;
      System.out.println("sum of array:"+ sum);
      System.out.println("average of array:"+average);
}
    
}
