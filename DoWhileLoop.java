import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        boolean keepGoing = true;
        do { 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number(negative number can exit the loop) ");
            int number = sc.nextInt();
            if(number < 0){
                keepGoing = false;
            }else{
                sum += number;
            }
        } while (keepGoing);
        System.out.println("The sum is: "+ sum);
    }
}
