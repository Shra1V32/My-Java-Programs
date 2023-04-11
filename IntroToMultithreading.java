/**
 * IntroToMultithreading
 */

class AmberHeader extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
    }
}
public class IntroToMultithreading extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        AmberHeader ah = new AmberHeader();
        IntroToMultithreading itm = new IntroToMultithreading();
        ah.start();
        itm.start();
    }
}