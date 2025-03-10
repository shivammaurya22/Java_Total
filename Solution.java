import java.util.Scanner;


public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i < t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             // Initialize the series
             int currentTerm = a;
             StringBuilder result = new StringBuilder();
             
             // Generate the series
             for (int j = 0; j < n; j++) {
                 currentTerm += (int) (Math.pow(2, j) * b);
                 result.append(currentTerm).append(" ");
             }
             
             // Print the result for the current query
             System.out.println(result.toString().trim());
        }
        in.close();
    }
}