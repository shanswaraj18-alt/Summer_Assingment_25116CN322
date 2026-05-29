//WAP to check pallindrome
package DAY2;
import java.util.Scanner;
public class QUESTION8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter string");
        String strng = Sc.nextLine();
        String reverse  ="";
        int n  = strng.length();
        for(int i =n-1;i>=0;i--){
            reverse += strng.charAt(i);
        }
        if(reverse.equals(strng)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
    
}
