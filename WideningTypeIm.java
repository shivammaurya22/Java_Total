public class WideningTypeIm {
    public static void main(String[] args) {
        // Main Method
        // implicit Widening examples  automatic promotion 
        // lower to upper byte -> short -> int -> long -> float -> double
        char c = 'a'; //normal
        int i = c;  // Widening char to int 
        float f = i;  //Widening int to float
        double d = f;  // Widening float to double
        float f2 = 1L;  // Widening long to float
    }
}
