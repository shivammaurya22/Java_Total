class Vehicle{
    void running(){
        System.out.println("The car is running...");
    }
}

class Car extends Vehicle{
    void stop(){
        System.out.println("The car stops...");
    }
}

public class Inheritance01 {
    public static void main(String[] args) {
        // Single inheritance in java
      Car ca = new Car();
      ca.running();
      ca.stop();
    }
}
