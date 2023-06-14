import java.util.*;
public class LegacyClasses {
    public static void main(String[] args) {
        Vector ve = new Vector<>();
        ve.add(10);
        ve.add(20);
        ve.add(30);
        ve.add(40);
        ve.add(50);
        ve.add(60);

        Enumeration en = ve.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        Hashtable ht = new Hashtable<>();
        ht.put("a", new Integer(100));
        ht.put("b", new Integer(200));
        ht.put("c", new Integer(300));
        ht.put("d", new Integer(400));

        Set st = ht.entrySet();
        Iterator itr = st.iterator();

        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry)itr.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
