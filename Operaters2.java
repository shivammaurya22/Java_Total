public class Operaters2 {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        System.out.println(x == y); // false
        System.out.println(x >= y); // true
        System.out.println(x <= y); // false
        System.out.println(x != y); // true
        System.out.println(x > y); // true
        System.out.println(x < y); // false
        // Java using implicit promotion (use temporary variable in memory as int-> double) soo 3 --> 3.0  
        System.out.println(3 + 4.0); // 7.0
        System.out.println(4 == 4.0); //true
    }
}
