import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data, temp;
        int tot=0, num;
        System.out.println("Enter the input values: ");
        data = s.nextLine();
        StringTokenizer st = new StringTokenizer(data);
        System.out.println("Total no. of Tokens: " + st.countTokens());

        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            num = Integer.parseInt(temp);
            tot+=num;
            System.out.println(num);
        }
        System.out.println("Sum of integers: " + tot);
    }
}
