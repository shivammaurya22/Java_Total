//abstract class A{
interface A{
 // interfaces are not the class. abstract class == interface
    // public abstract void show();
   // static and final apply rules to all the variables in the interface.
   int age = 24; // variables are final soo you can't just create you assign the value too.
   String name = "GoD";
   void show();
   void run();
}
class B implements A{
    // Main thing all the creating methods you implement otherwise this class wants to be abstract as well.
    // we can't extends keyword because it is not a class,so thats why.
    public void show(){
        System.out.println("In a show.");
    }
    public void run(){
        System.out.println("In the Running...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        A obj = new B(); // You Cannot instantiate the type A, soo
        obj.show();
        obj.run();
        System.out.println(A.age); // it is static as well soo no need to objects
        System.out.println(A.name); // you can get name as well. and yes you can't change the variables value because it's final.
    }    
}
