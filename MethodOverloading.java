class A{
    public void show(int a){
        System.out.println("A show in Class A.");
    }
    public void show(int a, int b){
        System.out.println("Show call A with 2 parameter.");
    }
}

class B extends A{
    // first it will check in own class then it will go to parent class.
    public void show(int a){
        System.out.println("A show in Class B.");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        // Method overloading and overriding concepts.
        B obj = new B();
        obj.show(5,8);
    }
}
