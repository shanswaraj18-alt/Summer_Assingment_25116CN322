//WAP to find maximum occuring character
package DAY23;
import java.util.HashMap;
public class QUESTION92 {
    public static void main(String[] args) {
        String str ="abacdedefhdfg";
        int n= str.length();
        HashMap<Character,Integer> map1 =new HashMap<>();
        for(int i=0;i<n;i++){
        map1.put(str.charAt(i),map1.getOrDefault(str.charAt(i),0)+1) ;
      }
      int maxFreq=Integer.MIN_VALUE;
      char key ='1';
        for(int i=0;i<n;i++){
            if(map1.get(str.charAt(i))>maxFreq){
                maxFreq=map1.get(str.charAt(i));
                 key =str.charAt(i);
            }
        }
        System.out.println("max occuring key is:"+key);
}
}