package Day5.report;

import java.util.*;
import Day5.student.*;

public class ReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        Address addr = new Address(city, state);
        Student s = new Student(name, roll, marks, addr);

        System.out.println("\n--- Student Details ---");
        s.displayStudentDetails();

        sc.close();
    }
}
