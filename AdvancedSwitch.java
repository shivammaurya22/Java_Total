import java.util.Scanner;

public class AdvancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name --> ");
        String name = sc.next();

        // Advanced Switch like functional ->
        int nletters = 0;
        nletters = switch(name){
            case "Shiv", "Godl", "Shub", "Like" -> 4;
            case "Shiva", "Satya", "Shubh" -> 5;
            default ->{
                System.out.println("Invalid Name. "+name);
                yield -1;
            }
        };
        System.out.println("The letters is: "+nletters);
    }
}
