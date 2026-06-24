//WAP to compress a string
package DAY24;
import java.util.*;
public class QUEESTION94 {
      public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter String to compress");
        String str = Sc.nextLine();
        StringBuilder sb =new StringBuilder();
        int readingIndex=0;
        int writingIndex=0;
        int n=str.length();
        while(readingIndex<n){
          while(readingIndex<n-1&&str.charAt(readingIndex)==str.charAt(readingIndex+1)){
            readingIndex++;
          }
          sb.append(str.charAt(writingIndex));
          int count=readingIndex-writingIndex+1;
          if(count>1){
          sb.append(count);
          }
          readingIndex++;
          writingIndex=readingIndex;
        }
        System.out.println("compressed string is:"+sb.toString());
        Sc.close();
      }   
}
