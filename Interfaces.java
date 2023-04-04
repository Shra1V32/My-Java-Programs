interface myinterface {
    final int myid = 113;
    void display();
}

public class Interfaces implements myinterface {
    public void display() {
        System.out.println("ID is: " + myinterface.myid);
    }
    public static void main(String[] args) {
        Interfaces i = new Interfaces();
        i.display();
    }
}
