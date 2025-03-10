interface CanRun{
    void run();
}
interface CanBark{
    void bark();
}

class Dog implements CanBark, CanRun{
    public void run(){
        System.out.println("Running...");
    }
    public void bark(){
        System.out.println("Barking...");
    } 
}

public class Inheritance4 {
    public static void main(String[] args) {
        // main method 
        // Multiple Inheritance in java
        Dog doe = new Dog();
        doe.run();
        doe.bark();
    }
}
