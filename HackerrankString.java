import java.util.Scanner;

public class HackerrankString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
      
        // Perform operations 
        System.out.println(S.length());

        System.out.println(S.substring(start, end));
        
    }
}
