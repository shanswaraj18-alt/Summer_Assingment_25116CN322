//WAP to frequency of an element
package DAY14;
import java.util.HashMap;
import java.util.Scanner;
public class QUESTION54 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int[] arr ={1,1,1,2,2,3,4,4,4,5,5,6,6,7};
        int n =arr.length;
        for(int i=0;i<n;i++){
            map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
        }
        System.out.println("enter the element to find frequency:");
        Scanner Sc = new Scanner(System.in);
        int searchElement =Sc.nextInt();
        System.out.println("frequency of search element is:");
         System.out.println(map1.get(searchElement));
        Sc.close();
        }
    }

