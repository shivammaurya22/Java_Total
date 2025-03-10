import java.util.Scanner;

public class DataTypes03S{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t;i++){
        String input = sc.nextLine();
          try {
              long x = Long.parseLong(input);
              System.out.println(x +" can be fitted in:");
              if(x >= -128 && x <= 127) System.out.println("* bytes");
              else if(x >= -32768 && x <= 32767) System.out.println("* short");
              else if(x >= -2147483648 && x <= 2147483647) System.out.println("* int");
              else if(x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
          } catch (Exception e) {
            System.out.println(input + " can't be fitted anywhere.");
          }
        }
        sc.close();
    }
}