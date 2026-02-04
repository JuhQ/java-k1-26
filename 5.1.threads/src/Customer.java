public class Customer implements Runnable {
    private int customerId;
    private int ticketCount;
    private TicketSystem system;

    private static int id = 0;

    public Customer(int count, TicketSystem system) {
        id++;
        this.customerId = id;
        this.ticketCount = count;
        this.system = system;
    }

    public void run() {
        system.reserve(this, this.ticketCount);
    }

    public void reserveTickets(int count) {
        System.out.println("Asiakas " + customerId + " varasi " + count + " lippua");
    }

    public int getId() {
        return customerId;
    }
}
