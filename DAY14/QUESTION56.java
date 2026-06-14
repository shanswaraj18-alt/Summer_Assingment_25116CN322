//WAP to find dupllicates in array
package DAY14;
import java.util.HashMap;
public class QUESTION56{
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,4,6,7,8,5,1};
        int n= arr.length;
        HashMap<Integer,Integer> map2= new HashMap<>();
        for(int i=0;i<n;i++){
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }
        for(HashMap.Entry<Integer,Integer> Entry : map2.entrySet()){
                if(Entry.getValue()>1){
                System.out.println("duplicate element found:"+Entry.getKey());
            }
        }

        }
        
    }

