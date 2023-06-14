import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        stacks.push("ABC");
        stacks.push("XYZ");
        stacks.push("JKL");
        stacks.push("LMN");
        stacks.push("OPQ");

        stacks.pop();

        System.out.println("Present Stack: " + stacks);
        System.out.println("Peek Stack: " + stacks.peek());
        System.out.println("Index for JKL: " + stacks.search("JKL"));
        /*
         When the position is not found,
         the search method returns -1
         Which means that the value is not found
        */
    }
}
