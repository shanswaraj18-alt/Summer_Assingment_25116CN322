//union of two arrays
package DAY17;
import java.util.Arrays;
import java.util.HashSet;
public class QUESTION66 {
    public static void main(String[] args) {
        int[] arr1 ={2,3,6,4,8,9};
        int[] arr2={1,3,4,2,5,10};
    HashSet<Integer> hashset =new HashSet<>();
    for(int i:arr1){
         hashset.add(i);
    } 
    for(int i:arr2){
        hashset.add(i);
    }
    int[] unionArray =new int[hashset.size()];
    int index=0;
    for(int num:hashset){
        unionArray[index++]=num;
    }
    System.out.println(Arrays.toString(unionArray));
    }
    }
    

