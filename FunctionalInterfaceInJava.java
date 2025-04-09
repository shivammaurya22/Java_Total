@FunctionalInterface  // allos only only one mehtod define
interface A{
    void show();
   // void run();   // this will give you a error.
}

// class B implements A{
//     public void show(){
//         System.out.println("In show.");
//     }
// }

public class FunctionalInterfaceInJava {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("In show.");
            }
        };
        obj.show();
    }
}
