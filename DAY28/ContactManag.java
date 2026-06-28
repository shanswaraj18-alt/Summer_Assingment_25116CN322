package DAY28;

public class ContactManag {
    String name = "Shan";
    String phone = "9876543210";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        ContactManag c = new ContactManag();
        c.display();
    }
}
    
