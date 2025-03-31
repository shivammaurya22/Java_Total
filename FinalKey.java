class A{
    // if variable is final then you can't change the value.
    final int age = 20;
}
// final Class A like this you can final class.
// if class is final then you can't inherit the class.
class B extends A{
    // if method final then you can't override the method.
    public final int show(int a){
        return a;
    }
}

public class FinalKey {
    // final --> class, methods, variabels
 public static void main(String[] args) {
     B obj = new B();
    System.out.println(obj.age);
   int r = obj.show(5);
   System.out.println(r);
 }
}
