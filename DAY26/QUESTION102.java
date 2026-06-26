//WAP to create voting eligibility system
package DAY26;
import java.util.Scanner;
public class QUESTION102 {
    static void eligibilityCheck(int[] age){
        int n= age.length;
        for(int i=0;i<n;i++){
            if(age[i]>=18){
                System.out.println("age="+age[i] +"is eligible for voting");
            }
            else{
                System.out.println("age="+age[i]+"not eligible for voting");
            }
        }
    }
    public static void main(String[] args) {
    Scanner Sc =new Scanner(System.in);
    System.out.println("enter total no. of people to check their eligibility criteria");
    int n= Sc.nextInt();
    int[] age=new int[n];
    System.out.println("enter age to check eligibility criteria");
    for(int i=0;i<n;i++){
        System.out.println("enter age of person "+(i+1));
        age[i]=Sc.nextInt();
    }
        eligibilityCheck(age);
        Sc.close();
    }
    
}
