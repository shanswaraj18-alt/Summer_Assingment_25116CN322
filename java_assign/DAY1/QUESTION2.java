package DAY1;
import java.util.Scanner;
public class QUESTION2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter no.to print table of it:");
        int n = Sc.nextInt();
        int table=1;
        System.out.println("table of given no.is");
        for(int i=1;i<=10;i++){
            table=i*n;
            System.out.println(table);
        }
    }
    
}
