package Day3;

public class Rectangle {
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    int area(){
        return length*width;
    }
    int perimeter(){
        return 2*(length+width);
    }
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,20);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
