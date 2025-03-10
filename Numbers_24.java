import java.util.Random;

public class Numbers_24 {
    public static void main(String[] args) {
        Random random = new Random();
       // int x = random.nextInt(6)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        float a = random.nextFloat();
        System.out.println("Our Random number is: "+ y);
        System.out.println("Our Random Number is: "+ z);
        System.out.println("Our Random Number is: "+ a);
    }
}
