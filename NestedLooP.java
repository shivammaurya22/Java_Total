import java.util.Scanner;

public class NestedLooP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;
        System.out.println("Enter the Number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the Number of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter any one Symbol: ");
        symbol = sc.next();
        for (int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
        sc.close();
    }
}
