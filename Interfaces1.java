// abstract class Computer{
//     public abstract void code();
// }
interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Run, code, debug");
    }
}

class Desktop implements Computer{   // use implements instead of extends because of interface

    public void code(){
        System.out.println("Code run faster..");
    }
}
class Developer{
    public void code(Computer lap){
        lap.code();
    }
}

public class Interfaces1 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();
       // dev.code(lap);
       dev.code(desk);
    }    
}
