public class SquareCalculator {
    public static void main(String[] args) {
        int num = 4;
        SquareCalculator sqc = new SquareCalculator();
        int res = sqc.calculateSquare(num);
        System.out.println("The Square: "+ res);
    }
    public int calculateSquare(int num){
        return num*num;
    }
}
