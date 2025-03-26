import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // While Loop Working
        int sum = 0;
        boolean keepGoing = true;
        while(keepGoing){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number (Negative number to exit this loop)--> ");
            int n = sc.nextInt();
            if(n < 0){
                keepGoing = false;
            }else{
                sum += n;
            }
        }
        System.out.println("The Sum is: "+ sum);
        sc.close();
    }    
}
