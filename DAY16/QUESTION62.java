//WAP to find maximum frequency  element; 
package DAY16;
import java.util.HashMap;
import java.util.Map;
public class QUESTION62{
    public static void main(String[] args){
    HashMap<Integer,Integer> map1= new HashMap<>();
    int[] arr ={1,2,4,3,6,8,1,2,3,1};
    for(int i:arr){
        map1.put(i,map1.getOrDefault(i,0)+1);
    } 
    int maxFreq=0;
    int maxFreqElement =0;
    for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
          int key =entry.getKey();
          int frequency =entry.getValue();
          if(frequency>maxFreq){
            maxFreq= frequency;
            maxFreqElement=key;
           
          }}
    System.out.println("maximum frequency element is:"+ maxFreqElement);
    }
    }
