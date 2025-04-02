abstract class Animal{
    // methods
    abstract void makeSound(); // (no body) abstract method

    void sleep(){
        // concreate methods 
        System.out.println("sleeping....");
    }
}

// subclass providees implementation
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark, Bark...");
    }
}

// abstraction is used for declearing the methods and implementation as well.
// you can implement those methods which you are declear, in the concreate    class using inheritance (use extends keyword.) 
public class AbstractKeyword {
    public static void main(String[] args){
        // Abstract Keyword 
        Animal ani = new Dog();
        ani.makeSound();
        ani.sleep();

    }
}
