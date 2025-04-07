interface X {
    void run();
    void Sing();
}

interface Y extends Z{
   void run();
}
interface Z {
    void Sleep();
}

class All implements X,Y{
    public void run(){
        System.out.println("Running...");
    }
    public void Sing(){
        System.out.println("Singing a song.");
    }
    public void Sleep(){
        System.out.println("Sleeping");
    }
}

public class Interfaces2 {
    public static void main(String[] args) {
        // Create a object of the class
        X obj = new All();
        Y obj1 = new All();
        obj.Sing();
        obj.run();
        obj1.Sleep();
    }
}
