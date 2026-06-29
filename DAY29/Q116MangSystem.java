package DAY29;
import java.util.*;
public class Q116MangSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        int qty;
        double price;

        System.out.print("Enter Item Name: ");
        item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.println("\n Inventory Details");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Total Value: " + (qty * price));

        sc.close();
    }
}

