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

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        // main method call the methods 
        // Hierarichical Inheritance in java 
      Dog ani = new Dog();
      ani.eat();
      ani.bark();
      Cat ca = new Cat();
      ca.eat();
      ca.meow();
    }    
}

