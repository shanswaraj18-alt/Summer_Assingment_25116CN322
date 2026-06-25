//WAP to merge two sorted arrays
package DAY25;
import java.util.Arrays;
public class QUESTION97 {
    public static void main(String[] args) {
        int[] sortedArr1 ={1,3,4,5,6};
        int[] sortedArr2={0,2,7,8,9,10};
        int[] mergeArr=new int[sortedArr1.length+sortedArr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<sortedArr1.length&&j<sortedArr2.length){
            if(sortedArr1[i]<=sortedArr2[j]){
                mergeArr[k++]=sortedArr1[i++];
            }
            else{
                mergeArr[k++]=sortedArr2[j++];
            }
        }
        while(i<sortedArr1.length){
            mergeArr[k++]=sortedArr1[i++];
        }
        while(j<sortedArr2.length){
            mergeArr[k++]=sortedArr2[j++];
            }
        System.out.println(Arrays.toString(mergeArr));    
    }
}
