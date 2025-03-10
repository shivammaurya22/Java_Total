class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
       // main method 
       // single inheritance in java
       Dog dog = new Dog();
       dog.eat();
       dog.bark();
    }
}
