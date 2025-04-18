class A {
    public void show() throws ClassNotFoundException {

            Class.forName("EachFors");
            System.out.println("class Is loaded.");
        // } catch (ClassNotFoundException et) {
        //     System.out.println("Class Not Found.");
        // }
        //we are handle this exception using throws keyword 
    }
}

public class DuckingException {
    public static void main(String[] args) {
        // we not directly handels in the main class soo try catch is good way to handle it. instead of throws ClassNotFoundException.
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found !!");
        }
    }
}
