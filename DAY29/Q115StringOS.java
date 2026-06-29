package DAY29;
import java.util.*;
public class Q115StringOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("1.Length 2.Uppercase 3.Lowercase");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Length = " + str.length());
                break;
            case 2:
                System.out.println(str.toUpperCase());
                break;
            case 3:
                System.out.println(str.toLowerCase());
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
    

