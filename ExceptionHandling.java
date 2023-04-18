class MyOwnException extends Exception {
    MyOwnException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int marks = Integer.parseInt(args[0]);
        try {
            if (marks < 0 || marks > 100)
                throw new MyOwnException("Marks should be in between 0 to 100 only");
            else
                System.out.println("Entered marks are: " + marks);
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
    }
}
