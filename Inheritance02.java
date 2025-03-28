class Human{
    void canEat(){
        System.out.println("Human can eat.");
    }
}

class Person extends Human{
    void canRun(){
        System.out.println("A person can run...");
    }
}

class Dog extends Human{
    void canBark(){
        System.out.println("A dog can barking...");
    }
}

public class Inheritance02 {
    public static void main(String[] args) {
        // Multilevel Inheritance in java.
     Person per = new Person();
     Dog dog = new Dog();
     per.canEat();
     per.canRun();   
     dog.canBark();
     dog.canEat();
    }
}
