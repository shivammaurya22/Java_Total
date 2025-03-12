public class PrintsF{
    public static void main(String[] args){
        boolean mybool = true;  // %b for boolean
        char mychar = '@';      // %c for char
        String mystring = "Shivam";  //%s for string
        int myint = 24;              // %d means decimal for integers
        double mydouble = 1000;   //%f means float for double values
        // main method 
       // System.out.printf("%b", mybool);
       // System.out.printf("%c", mychar);
      //  System.out.printf("%s", mystring);
      //  System.out.printf("%d", myint);
        System.out.printf("%.2f", mydouble);
       // System.out.printf("%d This is the formet string ", 123);
    }
}