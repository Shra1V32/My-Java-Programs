public class MultilevelInheritance {
    public static void main(String[] args) {
        FinalTotal finalTotal = new FinalTotal();
        finalTotal.setstud(100, "Ramesh");
        finalTotal.setmarks(75, 85);
        finalTotal.calc();
        finalTotal.putstud();
        finalTotal.putmarks();
        finalTotal.puttotal();
    }
}

class Students {
    private int sno;
    private String sname;

    public void setstud(int no, String name) {
        sno = no;
        sname = name;
    }

    public void putstud() {
        System.out.println("Student number: " + sno);
        System.out.println("Student Name: " + sname);
    }
}

class Marks extends Students {
    protected int mark1, mark2;

    public void setmarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    public void putmarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

class FinalTotal extends Marks {
    private int total;

    public void calc() {
        total = mark1 + mark2;
    }

    public void puttotal() {
        System.out.println("Total: " + total);
    }
}