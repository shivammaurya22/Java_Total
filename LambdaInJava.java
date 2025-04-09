@FunctionalInterface  // allos only only one mehtod define
interface A{
    void show();
   // void run();   // this will give you a error.
}


public class LambdaInJava {
    public static void main(String[] args) {
        A obj = ()->    // this is the lambda Expression, its also there like new A() and public void show() but not showing.
            {   
                System.out.println("In show.");
            };
        obj.show();
    }
}
