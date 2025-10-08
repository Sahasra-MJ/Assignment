package Day4;

class Point{
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    void display() {
        System.out.println("x: " + x + ", y: " + y);
    }
}

public class PointCopy {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println("Original Point:");
        p1.display();
        Point p2 = new Point(p1);
        Point p3 = new Point(p2);
        System.out.println("\nCopied Points:");
        p2.display();
        p3.display();
        p1.x = 99;
        p1.y = 77;
        System.out.println("\nAfter modifying original point:");
        System.out.print("Original: ");
        p1.display();
        System.out.print("Copy 1:   ");
        p2.display();
        System.out.print("Copy 2:   ");
        p3.display();
    }
}
