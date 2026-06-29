package DAY29;
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add 2.Sub 3.Mul 4.Div");
        int ch = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not possible");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

}

