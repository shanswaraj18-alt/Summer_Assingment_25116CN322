//WAP to create number guessing game
package DAY26;
import java.util.Scanner;
public class QUESTION101 {
    public static void main(String[] args) {
        int secretNum = 5;
        Scanner Sc =new Scanner(System.in);
        System.out.println("you have 3 chance to win the game");
        System.out.println("enter the number you guess from 1 to 10");
        for(int i=0;i<3;i++){
            int enterNum =Sc.nextInt();
            if(enterNum==secretNum){
                System.out.println("bingoo!,you guess right");
                Sc.close();
                return;
            }
            else if(enterNum<7&&enterNum>3){
                System.out.println("you are close");
            }
            else{
                System.out.println("your guess is far away from answer");
            }
        }
        Sc.close();
    }
    
}
