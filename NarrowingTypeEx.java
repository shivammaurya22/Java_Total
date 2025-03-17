public class NarrowingTypeEx {
    public static void main(String[] args) {
        long x = 3000000000L; // This value exceeds the int range
        int y = (int) x; // Narrowing conversion

        System.out.println("Long value: " + x);
        System.out.println("Int value after narrowing: " + y);

        // try another Example
        int i = (int) 3.3;     // narrowing, double to int 
        byte b = (byte) 233;    // narrowing, int to byte
        float f = (float) 3.5;   // narrowing, double to float
        System.out.println(i+" "+b+" "+f); // 3 -23 3.5
    }
}
