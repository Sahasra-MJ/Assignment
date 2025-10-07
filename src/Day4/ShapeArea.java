package Day4;

public class ShapeArea {
    void area(){
        System.out.println("Area of Shapes:");
    }
}
class Circle extends ShapeArea{
    @Override
    void area(){
        System.out.println("Area of Circle:pi*r*r");
    }
}
class Rectangle extends ShapeArea{
    @Override
    void area(){
        System.out.println("Area of Rectangle:l*b");
    }
}
class Triangle extends ShapeArea{
    @Override
    void area(){
        System.out.println("Area of Triangle:1/2*b*h");
    }
}
class Main{
    public static void main(String[] args) {
        ShapeArea sa=new ShapeArea();
        sa.area();
        Circle c=new Circle();
        c.area();
        ShapeArea sa1=new Rectangle();
        sa1.area();
        ShapeArea sa2=new Triangle();
        sa2.area();
    }
}

