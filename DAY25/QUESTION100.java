//WAP to sort words by length
package DAY25;
import java.util.*;
public class QUESTION100 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("enter names");
        Scanner Sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            String name = Sc.nextLine();
        list1.add(name);
        }
        list1.sort((a,b)->a.length()-b.length());
        System.out.println(list1);
        Sc.close();
    }
}
