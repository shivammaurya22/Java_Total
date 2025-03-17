public class NarrowingTypeEx {
    public static void main(String[] args) {
        long x = 3000000000L; // This value exceeds the int range
        int y = (int) x; // Narrowing conversion

        System.out.println("Long value: " + x);
        System.out.println("Int value after narrowing: " + y);
    }
}
