public class Swap {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println("Before the swaping 2 variables: x= " + x + " and y= "+ y);
        x = x ^ y;
        System.out.println("x = "+ x + " and y= "+ y);
        y = x ^ y;
        System.out.println("x = "+ x + " and y= "+ y);
        x = x ^ y;
        System.out.println("After swapping: x = "+ x +" y = "+ y);
    }
}
