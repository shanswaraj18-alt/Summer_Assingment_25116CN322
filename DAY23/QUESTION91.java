//WAP to check for anagram strings
package DAY23;
import java.util.Scanner;
import java.util.Arrays;
public class QUESTION91 {
    public static void main(String[] args) {
        System.out.println("enter two string to check it is anagram or not");
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter string 1");
        String str1 = Sc.next();
        int n1=str1.length();
        System.out.println("enter string 2");
        String str2 =Sc.next();
        int n2 =str2.length();
        int[] charFreq1 = new int[26];
        int[] charFreq2=new int[26];
        if(n1!=n2){
            System.out.println("strings are not anagram");
            Sc.close();
            return;
        }
        for(int i=0;i<n1;i++){
            char ch1 =str1.charAt(i);
            int index1 =ch1-'a';
            charFreq1[index1]++;
            char ch2 =str2.charAt(i);
            int index2 =ch2-'a';
            charFreq2[index2]++;
        }
        if(Arrays.equals(charFreq1,charFreq2)){
            System.out.println("given strings are anagram");
        }else{
            System.out.println("given strings are not anagram");
        }   
        Sc.close();
    }
    
}
