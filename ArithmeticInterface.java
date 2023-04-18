interface Arithmetic {
    void add(int a, int b);

    void sub(int a, int b);

    void mul(int a, int b);

    void div(int a, int b);
}

public class ArithmeticInterface implements Arithmetic {
    public void add(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction is: " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication is: " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Division is: " + (a / b));
    }

    public static void main(String[] args) {
        ArithmeticInterface a = new ArithmeticInterface();
        a.add(4, 5);
        a.sub(4, 5);
        a.mul(4, 5);
        a.div(6, 3);
    }
}
