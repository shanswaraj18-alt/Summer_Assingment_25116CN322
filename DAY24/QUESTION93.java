//WAP to check String rotation
package DAY24;
import java.util.Scanner;
public class QUESTION93 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter string 1");
        String str1 =Sc.next();
        System.out.println("enter string 2 to check it is a substring of string 1 or not");
        String str2 =Sc.next();
        str1=str1.concat(str1);
        if(str1.contains(str2)){
            System.out.println("string 2 is a substring of string 1");
        }else{
            System.out.println("string 2 is not a substring of string 1");
        } 
        Sc.close();
    }
    
}
