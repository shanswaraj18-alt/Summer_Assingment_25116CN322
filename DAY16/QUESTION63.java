//WAP to find pair with given sum
package DAY16;
import java.util.ArrayList;
import java.util.List;
public class QUESTION63 {
    public static void main(String[] args) {
        int[] arr={45,34,56,23,45,55,35,11};
        int sum =90;
        int n = arr.length;
        List<List<Integer>> list1=new ArrayList<>();
        for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
            if(arr[i]+arr[j]==sum){
            ArrayList<Integer> pair =new ArrayList<Integer>();
            pair.add(arr[i]);
            pair.add(arr[j]);
            list1.add(pair);
            }
        }
        }
        System.out.println(list1);
    }
    
}
