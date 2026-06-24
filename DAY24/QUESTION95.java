//WAP to find longest word;
package DAY24;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class QUESTION95 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter String :");
        String str = Sc.nextLine();
        int readingIndex=0;
        int writingIndex=0;
        int n=str.length();
        HashMap<String,Integer> map1=new HashMap<>();
        while(readingIndex<n){
          while(readingIndex<n&&str.charAt(readingIndex)!=' '){
            readingIndex++;
          }
          String key =str.substring(writingIndex,readingIndex);
          int count=key.length();
          map1.put(key,count);
          while(readingIndex<n&&str.charAt(readingIndex)==' '){
          readingIndex++;}
          writingIndex=readingIndex;
        }
        int maxFreq =Integer.MIN_VALUE;
        String longestWord ="";
        for(Map.Entry<String,Integer> entry: map1.entrySet()){
           String key =entry.getKey();
           int freq =entry.getValue();
           if(freq>maxFreq){
            maxFreq=freq;
            longestWord = key;
           }
        }
        System.out.println("longest word is:"+longestWord);
        Sc.close();
        
      }   
}

    

