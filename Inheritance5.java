interface CanRun{
    void run();
}
interface CanBark{
    void bark();
}

class Animal{
    void eat(){
        System.out.println("Eating....");
    }
}
class Dog extends Animal implements CanBark, CanRun{
    public void run(){
        System.out.println("Dog is Running...");
    }
    public void bark(){
        System.out.println("Dog is Barking....");
    }
}

class Cat extends Animal implements CanRun{
    public void run(){
        System.out.println("Cat is Running...");
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        // main method
        // hybrid Inheritance not supported directly
      Dog dbs = new Dog();
      dbs.eat();
      dbs.run();
      dbs.bark();
    
      Cat ca = new Cat();
      ca.run();
      ca.eat();
    }
}
