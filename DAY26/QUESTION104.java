//WAP to create quiz application
package DAY26;
import java.util.*;
public class QUESTION104 {
    public static void main(String[] args) {
        String[] questions =new String[4];
        questions[0]= "Q1. which sport is known as king of sports world wide?";
        questions[1]= "Q2. In which sport would you use a shuttlecock?";
        questions[2]= "Q3. In which sport india won worldCup in year 2026?";
        questions[3]= "Q4. whic sport Virat Kohli plays?";
        String[] options=new String[4];
        options[0]="Cricket";
        options[1]="football";
        options[2]="badminton";
        options[3]="tennis";
        String[] ans =new String[4];
        ans[0]="football";
        ans[1]="badminton";
        ans[2]="Cricket";
        ans[3]="Cricket";
        System.out.println("Sports quiz");
        Scanner Sc =new Scanner(System.in);
        int score =0;
        for(int i=0;i<4;i++){
                System.out.println(questions[i]);
                for(int j=0;j<4;j++){
                System.out.println(options[j]);
            }
                System.out.println("enter answer");
                String answer =Sc.next();
                if(answer.equalsIgnoreCase(ans[i])){
                    System.out.println("true");
                    score+=10;
                }
                else{
                    System.out.println("wrong");
                }                
            }    
        System.out.println("your score is:"+score);
        Sc.close();
    }
    
}
