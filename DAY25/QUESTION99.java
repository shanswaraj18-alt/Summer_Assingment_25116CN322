//WAP to sort names alphabetically
package DAY25;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class QUESTION99 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        System.out.println("enter names:");
        Scanner Sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            String name =Sc.nextLine();
            list1.add(name);
        }
        Collections.sort(list1);
        System.out.println(list1);
        Sc.close();
    }
    
}
