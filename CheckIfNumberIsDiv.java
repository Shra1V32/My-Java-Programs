// To check whether the given number is Even Number
public class CheckIfNumberIsDiv {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        int k = (a&(a-1)); 
        System.out.println(k);
    }
}
