import java.util.*;

public class FrameworksCollections {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        List ll = new LinkedList<>();
        Map m = new TreeMap<>();
        Map hm = new HashMap<String, Double>();
        Set s = new TreeSet<>();

        l.add(new Integer(1));
        l.add(new Integer(4));
        l.add(new Integer(3));
        l.add(new Integer(2));
        l.add(new Integer(5));

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");

        m.put(new Integer(1), "A");
        m.put(new Integer(4), "B");
        m.put(new Integer(3), "C");
        m.put(new Integer(2), "D");
        m.put(new Integer(3), "E");

        hm.put("John", 3251.21);
        hm.put("Tom", 123.41);
        hm.put("Jane", 1452.23);
        hm.put("Halk", 66.23);
        hm.put("Smith", -45.21);

        s.add(new Integer(1));
        s.add(new Integer(4));
        s.add(new Integer(3));
        s.add(new Integer(2));
        s.add(new Integer(3));

        System.out.println("List: ");
        Iterator i = l.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("Linked List " + ll);
        System.out.println("Map using keys");
        i = m.keySet().iterator();
        while (i.hasNext())
            System.out.println(m.get(i.next()));

        System.out.println("Map using entries");
        i = m.entrySet().iterator();
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println();

        System.out.println("Hash Map");
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println("Set");
        i = s.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
