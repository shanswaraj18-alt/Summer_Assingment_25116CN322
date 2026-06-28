//WAP to create library management SYSTEM 
package DAY28;
import java.util.*;
public class QUESTION109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book(101, "Java");

        System.out.println("1. Display Book");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.print("Enter Choice: ");

        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Book ID: " + b.id);
                System.out.println("Book Name: " + b.name);
                System.out.println("Status: " + (b.issued ? "Issued" : "Available"));
                break;

            case 2:
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Book Already Issued");
                }
                break;

            case 3:
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book Returned");
                } else {
                    System.out.println("Book Already Available");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
    

