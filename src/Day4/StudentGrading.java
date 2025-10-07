package Day4;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    int marks;
    String grade;
    Student(String name,int age,int marks,String grade){
        super(name,age);
        this.marks=marks;
        this.grade=grade;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
}

class GraduateStudent extends Student{
    String researchTopic;
    GraduateStudent(String name,int age,int marks,String grade,String researchTopic){
        super(name,age,marks,grade);
        this.researchTopic=researchTopic;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Research Topic: "+researchTopic);
    }
}

public class StudentGrading {
    public static void main(String[] args) {
        Person p=new Person ("John Paulo",10);
        p.display();
        System.out.println("--------------");
        Student s=new Student ("John Paulo",100,50,"A");
        s.display();
        System.out.println("--------------");
        GraduateStudent g=new GraduateStudent("Ram",19,99,"A","AI");
        g.display();
    }
}
