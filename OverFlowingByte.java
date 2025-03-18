public class OverFlowingByte{
    public static void main(String[] args){
        // Main Method

        // Situations where casting is not always necessary
        char c = 12;  // can hold 0 to 65,535
        char c2 = 90_000;  // compiler error
        short s = 12;
        s = c;
        s = (short) c;
        c = s;
        c = (char) s;

        final char c1 = 12;
        short s1 = 12;
        s1 = c1;

    }
}