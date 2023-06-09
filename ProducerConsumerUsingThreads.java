class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
            contents = value;
            available = true;
            notifyAll();
        }
    }

}

class Consumer extends Thread {
    int value = 0;
    private int number;
    private CubbyHole cubbyHole;

    public Consumer(CubbyHole c, int number) {
        cubbyHole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyHole.get();
            System.out.println("Consumer #" + this.number + "got: " + value);
        }
    }
}

class Producer extends Thread {
    private CubbyHole cubbyHole;
    private int number;

    public Producer(CubbyHole c, int number) {
        cubbyHole = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyHole.put(i);
            System.out.println("Producer #" + this.number + "put: " + i);
            try {
                sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ProducerConsumerUsingThreads {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);
        p1.start();
        c1.start();
    }
}
