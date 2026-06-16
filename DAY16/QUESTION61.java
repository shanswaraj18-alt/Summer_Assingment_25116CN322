//WAP to find missing no.in array
package DAY16;
public class QUESTION61{
    public static void main(String[] args) {
        int[] arr={1,3,2,4,8,7,6,9,10};
        int n =arr.length;
        int totalSum=n*(n+1)/2;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int missingNum =-totalSum+sum;
        System.out.println("missing no. from array is:"+missingNum);
    }
}
