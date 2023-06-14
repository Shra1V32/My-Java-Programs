import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Iteration {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        Iterator<String> itr = myList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
