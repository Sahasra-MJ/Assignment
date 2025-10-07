package Day4;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starting");
    }
    @Override
    void stop() {
        System.out.println("Car stopping");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike starting");
    }
    @Override
    void stop() {
        System.out.println("Bike stopping");
    }
}

public class VehicleControl {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.stop();
        Bike b=new Bike();
        b.start();
        b.stop();
    }
}
