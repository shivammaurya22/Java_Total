public class LooP {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numbers: "+ i);
        }
        for(int j = 10; j >= 0; j--){
            System.out.println("Numbers of J: "+j);
        }
        for (int k = 5; k >= 0; k--) {
            for(int z = 1; z <= k; z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
