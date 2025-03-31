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
        super(2);  // because super has parameter 2 soo find parameter construcor
        System.out.println("In B");
    }
    public B(int n){
        super(5);
        System.out.println("in B integer.");
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args) {
        B obj = new B();
    }
}
