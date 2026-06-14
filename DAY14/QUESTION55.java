//WAP to second largest element
package DAY14;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class QUESTION55 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>();
        System.out.print("enter the elements in list: ");
        int n=6;
        for(int i=0;i<=n;i++){
            Scanner Sc =new Scanner(System.in);
            int element =Sc.nextInt();
            list1.add(element); 
        }
        Collections.sort(list1);
        System.out.println("second largest element of list is:");
        System.out.println(list1.get(n-1));
    }
    
}
