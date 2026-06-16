//WAP to remove duplicates from array
package DAY16;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class QUESTION64 {
    public static void main(String[] args) {
        Integer[] arr ={1,2,4,3,4,5,6,5,3,7};
        int n = arr.length;
        List<Integer> list1=new ArrayList<>(); 
        for(int i=0;i<n;i++){
                if(!list1.contains(arr[i])){
                 list1.add(arr[i]);
                }}
            
        
        System.out.println(list1);
    }
    
}
