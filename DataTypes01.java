public class DataTypes01 {
    public static void main(String[] args) {
        byte a = 127; // 1 byte 
        short b = 200; // 2 byte 
        int c = 10000; // 4 byte
        long d = 100000L; // 8byte

        float e = 10.5f; // 4 byte
        double f = 99.76; //8 byte

        char g = 'A'; //2 byte(Stotres single character)
        boolean h = true; // 1 byte (stores true/false)

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}
