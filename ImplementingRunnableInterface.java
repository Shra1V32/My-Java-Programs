public class ImplementingRunnableInterface implements Runnable {
    Thread t = new Thread();
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(i+t.getName());
        }
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ImplementingRunnableInterface t1 = new ImplementingRunnableInterface();
        ImplementingRunnableInterface t2 = new ImplementingRunnableInterface();
        Thread a = new Thread(t1);
        Thread b = new Thread(t2);
        a.start();
        b.start();
    }
}
