class Student {
    int id, passoutYear;
    String name, contactNumber, collegeName;

    Student(String contactNumber, String collegeName, int passoutYear) {
        this.contactNumber = contactNumber;
        this.passoutYear = passoutYear;
        this.collegeName = collegeName;
    }

    Student(int id, String name) {
        this("2891084313", "MVSR", 2025);
        this.id = id;
        this.name = name;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s = new Student(101, "John");
        System.out.println("Printing Student Information: \n");
        System.out.println("Name: " + s.name + "\nId: " + s.id + "\nContact No.: " + s.contactNumber
                + "\nCollege Name: " + s.collegeName + "\nPassing Year: " + s.passoutYear);
    }
}
