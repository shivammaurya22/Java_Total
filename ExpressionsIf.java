public class ExpressionsIf{
    public static void main(String[] args) {
        // Ternary operator in java
        // main method of the class
        int x = 4;
        String s = x % 2 == 0 ? " is an even Number." : " is odd Number.";
        System.out.println(x + s);

        // compound assignment operator
        byte b1 = 3, b2 = 4;
    //  b1 = b1 + b2;  // compiler error
        b1 = (byte) (b1+ b2);  // ok 
        b1 += b2; // ok no cast required   
        System.out.println(b1);  
    }
}