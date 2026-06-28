//WAP for creating ticket booking system
package DAY28;

public class TicketBooking {
    int seats =5;
    void bookTicket(int n) {
        if (n <= seats) {
            seats -= n;
            System.out.println(n + " ticket(s) booked.");
            System.out.println("Available seats: " + seats);
        } else {
            System.out.println("Not enough seats available.");
        }
    }
    public static void main(String[] args) {
        TicketBooking t = new TicketBooking();
        t.bookTicket(2);
    }
}

