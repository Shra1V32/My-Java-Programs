import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        vec.add("Hello");
        vec.add("World");
        vec.add("This");
        vec.add("Is");
        vec.add("Shravan");

        vec.add(4, "V");

        System.out.println(vec);

        Vector<String> other = new Vector<>();
        other.add("This is new Vector");
        other.addAll(vec);

        System.out.println(other);
        
    }
}
