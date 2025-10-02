package Day3;

public class Student {
    String name;
    int rollNo;
    int marks;
    Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("-------------");
    }
    public static void main(String[] args){
        Student s1=new Student("Ram",12,89);
        Student s2= new Student("Sita",16,78);
        Student s3=new Student("Rahul",14,99);
        s1.print();
        s2.print();
        s3.print();
    }
}
