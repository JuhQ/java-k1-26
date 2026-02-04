public class TicketMain {

    private static int N = 15;

    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        for (int i = 1; i <= N; i++) {
            int ticketCount = (int) (Math.random() * 3) + 1;
            Customer customer = new Customer(ticketCount, system);

            // luodaan 15 (N=15) customer säiettä
            Thread worker = new Thread(customer);

            // käynnistetään säie, start() metodi kutsuu automaattisesti run() metodia
            worker.start();
        }
    }
}
