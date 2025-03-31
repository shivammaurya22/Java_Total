class A{
    public A(){
      //  super();
        System.out.println("In A");
    }
    public A(int n){
      //  super();
        System.out.println("In A integer.");
    }
}

class B extends A{
    public B(){
        super();  // here call this(); and run it and print.
        // because super has parameter 2 soo find parameter construcor
        System.out.println("In B");
    }
    public B(int n){
      //  super(5);
        this(); // this method refer to print the default constructor of same class but super is refer to print the constructor of parent class.
        System.out.println("in B integer.");
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
