public class TicketSystem {
    int availableTickets = 10;

    public synchronized void reserve(Customer customer, int count) {
        if (availableTickets - count >= 0) {
            // jos jäljellä olevia lippuja on enemmän kuin ollaan varaamassa, varataan
            availableTickets -= count;
            customer.reserveTickets(count);
        } else {
            // TODO: Ehkä tämä viesti pitäisi tulla Customer luokasta?
            System.out.println("Asiakas " + customer.getId() + " ei voinut varata " + count + " lippua");
        }
    }
}
