//WAP to find first repeating character
package DAY23;
import java.util.LinkedHashMap;
public class QUESTION90 {
     public static void main(String[] args) {
        String str ="abcdedefhfg";
        int n= str.length();
        LinkedHashMap<Character,Integer> map1 =new LinkedHashMap<>();
        for(int i=0;i<n;i++){
        map1.put(str.charAt(i),map1.getOrDefault(str.charAt(i),0)+1) ;
      } 
        for(int i=0;i<n;i++){
            if(map1.get(str.charAt(i))!=1){
                System.out.println("first repeating character is:"+str.charAt(i));
                return;
            }
        }
        }
}
