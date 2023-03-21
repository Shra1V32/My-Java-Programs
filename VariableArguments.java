public class VariableArguments {
    void display(int ...a) {
        System.out.println("Number of Variable Arguments: " + a.length);
        for (int i: a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        VariableArguments variableArgument = new VariableArguments();
        variableArgument.display(2);
        variableArgument.display(2,3);
        variableArgument.display(2,3,4);
        variableArgument.display(2,3,4,5);
    }
}
