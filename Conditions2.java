import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Game: y or Y");
        String response = sc.next();
        if (!response.equals("y") && !response.equals("Y")) {
            System.out.println("You are exit this game.");
                        
        }else{
            System.out.println("Now you are playing the game.");
        }
        sc.close();
    }
}
