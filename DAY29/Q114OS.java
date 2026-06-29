package DAY29;
import java.util.*;
public class Q114OS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("1.Display 2.Search");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                for (int i : arr)
                    System.out.print(i + " ");
                break;

            case 2:
                System.out.print("Enter element: ");
                int x = sc.nextInt();
                boolean f = false;
                for (int i : arr)
                    if (i == x) f = true;
                System.out.println(f ? "Found" : "Not Found");
                break;

            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
    

    

