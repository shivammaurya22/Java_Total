public class PostFix {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        ++x;
        System.out.println("Vlaue of x: "+ x); // 6
       // ++x;
        System.out.println("Vlaue of x: "+ x++); // 6
       // --x;
        System.out.println("Vlaue of x: "+ x); // 7
        y--;
        System.out.println("Vlaue of y: "+ y); // 3
        // x--;
        System.out.println("Vlaue of y: "+ --y); //2
        System.out.println("Vlaue of y: "+ y); //2 
    }
}
