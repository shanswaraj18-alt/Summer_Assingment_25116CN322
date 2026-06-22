//WAP to check pallindrome string
package DAY22;
import java.util.Scanner;
public class QUESTION85 {
    public static void main(String[] args) {
        System.out.println("enter string to check pallindrome");
        Scanner Sc =new Scanner(System.in);
        String str=Sc.next();
        if(checkPallindrome(str)){
            System.out.println("entered string is pallindrome");
        }
        else{
            System.out.println("it is not pallindrome");
        }
        Sc.close();;
    }
    static Boolean checkPallindrome(String str){    
        int i= 0;
        int j=str.length()-1;
        while(i<=j){
         if(str.charAt(i)!=str.charAt(j)){
            return false;
         }
         i++;
         j--;
        }
        return true;        
    }
    
}
