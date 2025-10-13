package Day5.student;

public class Student {
    String name;
    int rollNo;
    double marks;
    Address address;

    public Student(String name, int rollNo, double marks, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.address = address;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
    }
}
