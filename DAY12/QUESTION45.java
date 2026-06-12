//WAP to write function for pallindrome
package DAY12;
import java.util.Scanner;
public class QUESTION45 {
    static boolean IsPallindrome(String str){
        str = str.toLowerCase();
        int i=0;
        int j=str.length() -1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter character to check pallindrome");
        String str = Sc.nextLine();
        System.out.println(IsPallindrome(str));
        Sc.close();
        }
    }

