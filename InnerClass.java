class A{

    public void show(){
        System.out.println("Show A");
    }

    // create another class in the class is called innner class
    static class B{   
        public void show(){
            System.out.println("Show B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A cls = new A();
      //  A.B bcl = cls.new B();  // for non-static class 
        // if you are using static class then you use, and also you use static for inner class not for parent class. 
        A.B bcl = new A.B(); // for static class
        cls.show();
        bcl.show();

    }
}
