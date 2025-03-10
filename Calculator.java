public class Calculator{
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println("The Sum: "+add(a, b));
        Calculator obj = new Calculator();
        obj.multiply(a, b);
    }
    public static int add(int a, int b){
        return a + b;
    }
    public void multiply(int a, int b){
        System.out.println("The Multiply: "+a*b);
    }
}