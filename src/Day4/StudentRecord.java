package Day4;

class Student1{
    String name;
    int rollNo;
    int marks;

    Student1(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student1(Student1 s){
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Jack", 23, 45);
        System.out.println("Original Details");
        s1.display();
        Student1 s2 = new Student1(s1);
        System.out.println("Copied Details");
        s2.display();
        s1.marks = 50;
        System.out.println("\nAfter modifying original student's marks:");
        System.out.println("Original Student:");
        s1.display();
        System.out.println("\nCopied Student (unchanged):");
        s2.display();
    }
}
