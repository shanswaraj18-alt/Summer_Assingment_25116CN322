package DAY17;
import java.util.Arrays;
import java.util.HashSet;
public class QUESTION68 {
    public static void main(String[] args) {
    int[] arr1={2,4,6,8,10,8};
    int[] arr2={1,3,5,6,7,9,10};
    HashSet<Integer> set1=new HashSet<>(); 
    HashSet<Integer> set2=new HashSet<>();
            for(int i:arr1){
                set1.add(i);
            }
            for(int j:arr2){
                set2.add(j);
            }
            set1.retainAll(set2);
            int[]  commonElementArr=new int[set1.size()];
            int index=0;
            for(int num:set1){
            commonElementArr[index++]=num;
            }
            System.out.println(Arrays.toString(commonElementArr));
        }
        
    
    }

    

