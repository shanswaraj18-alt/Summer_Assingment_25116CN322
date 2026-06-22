//WAP to character frequency
package DAY22;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class QUESTION87 {
    public static void main(String[] args) {
        System.out.println("enter string to count character frequency");
        Scanner Sc =new Scanner(System.in);
        String Str =Sc.next(); 
        HashMap<Character,Integer> map1 =new HashMap<>();
        for(int i=0;i<Str.length();i++){
        map1.put(Str.charAt(i),map1.getOrDefault(Str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            System.out.println("frequency of "+entry.getKey()+" is:");
            System.out.println(entry.getValue());

        }
        Sc.close();

    }
}
