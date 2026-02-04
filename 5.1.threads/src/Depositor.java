import java.math.BigInteger;

// Depositor is our worker here
class Depositor implements Runnable {
    private Account account;
    private int     n;

    public Depositor(Account account, int n) {
        this.account = account;
        this.n       = n;
    }

    public void run() {
        for (int i = 0; i < n; i++){
            // System.out.println(account.getBalance());
            account.deposit(BigInteger.ONE);    // we deposit 1 (unit of money)
        }
    }
}