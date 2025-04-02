abstract class A{
    public abstract void show();
}
   // what if anonymous class with abstract class
// class B extends A {
//     public void show(){
//         System.out.println("in B show.");
//     }
// }

public class AbstractAnonymousClass {
    public static void main(String[] args) {
        A obj = new A()  // how can we create this with abstract class, 
        // because you are creating an object of anonymous class, not class A.
        {
            public void show(){
                System.out.println("in New show.");
            }
        };
        obj.show();
    }
}
