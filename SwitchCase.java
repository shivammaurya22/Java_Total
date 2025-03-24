import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name--> ");
        String name = sc.next();
        
        switch (name) {
            case "Soccer":
                System.out.println("I play Soccer.");
                break;
            case "Cricket":
                System.out.println("I play Cricket.");
                break;    
            default:
                System.out.println("Unknown Name.");
        }
    }
}
