class SharedAccount {
    private double balance;

    public SharedAccount(double initialAmount) {
        balance = initialAmount;
    }

    public synchronized void completeTransaction(double amount) {
        double temp = balance + amount;
        if (amount < 0) {
            System.out.println("Withdrawing: " + Math.abs(amount));
        } else
            System.out.println("depositing" + amount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Transaction interrupted");
        }
        balance = temp;
        System.out.println("Current Balance: " + balance);
    }
}

class SharedAccountClient implements Runnable {
    SharedAccount sa;
    double transaction;

    public SharedAccountClient(SharedAccount sa) {
        this.sa = sa;
    }

    public void SetTransaction(double transaction) {
        this.transaction = transaction;
    }

    public void run() {
        sa.completeTransaction(transaction);
    }
}

public class SynchronizedKeyword {
    public static void main(String[] args) {
        SharedAccount sa = new SharedAccount(400);
        SharedAccountClient c1 = new SharedAccountClient(sa);
        SharedAccountClient c2 = new SharedAccountClient(sa);
        double x1 = 1000;
        double x2 = -400;
        c1.SetTransaction(x1);
        c2.SetTransaction(x2);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
