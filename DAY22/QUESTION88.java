//WAP to remove space from string
package DAY22;
import java.util.Scanner;
public class QUESTION88 {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner Sc=new Scanner(System.in);
        String str =Sc.nextLine();
        StringBuilder sb =new StringBuilder();
        int j=0;
        int i=0;
        while(j<str.length()){
            while(j<str.length()&&str.charAt(j)==' '){
                j++;
            }
            i=j;
            while(j<str.length()&&str.charAt(j)!=' '){
            j++;
           }
           if(i<j){
           sb.append(str.substring(i,j));
           }
              
        }
        Sc.close();
        System.out.println(sb.toString());   
    }
    
}
