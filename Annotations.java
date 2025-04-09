class A{
    public void showinthecurrentclassofethesameclass(){
        System.out.println("In A Show.");
    }
}

class B extends A{
    // Annotations will helps us to override the methods correctly
    @Override  // annotations start with @ symbal.
    public void showinthecurrentclassofethesameclass(){
        System.out.println("In B Show.");
    }
}

public class Annotations{
    public static void main(String[] args) {
        // creating object
        B obj = new B();
        obj.showinthecurrentclassofethesameclass(); // in A show
    }
}