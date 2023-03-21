/**
 * MethodOverloading
 */

class OverloadMethod {
    void sum(int a, int b) {
        System.out.println("Result is: " + (a + b));
    }

    float sum(float a, float b) {
        return (a + b);
    }

    double sum(double a, double b) {
        return (a + b);
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        OverloadMethod a1 = new OverloadMethod();
        a1.sum(3, 4);
        float x = a1.sum(3.4f, 4.5f);
        System.out.println("Sum of floating point numbers: " + x);
        double y = a1.sum(3.45, 4.56);
        System.out.println("Sum of double numbers: " + y);
    }
}