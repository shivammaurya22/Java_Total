@FunctionalInterface  // allos only only one mehtod define
interface A{
    void show(int i);
   // void run();   // this will give you a error.
}
// this is the lambda Expression ->, its also there like new A() and public void show() but not showing.

public class LambdaInJava {
    public static void main(String[] args) {
      //  A obj = ()-> System.out.println("In show.");
        // there is no need to extra curly bracket and semicoloen as well;
        // what if we get a parameter int 5 then; (int i) is good but you already define above this parameter will be int then there is no need to define int. so (i) -> or i -> 
        A obj = i -> System.out.println("In Show.");
        obj.show(5);
    }
}
