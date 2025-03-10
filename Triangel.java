import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sc.nextDouble();
        System.out.println("Enter y: ");
        y = sc.nextDouble();
        z = Math.sqrt((x*x+y*y));
        System.out.println("The Total area of Tri is z= "+ z);
        sc.close();
    }
}
