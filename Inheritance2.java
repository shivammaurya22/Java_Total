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

class Puppy extends Dog{
    void walk(){
        System.out.println("Walking...");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        // main method call the methods 
        // Multilevel Inheritance in java 
      Puppy p = new Puppy();
      p.eat();
      p.bark();
      p.walk();
    }    
}
