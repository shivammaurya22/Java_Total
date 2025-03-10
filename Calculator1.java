public class Calculator1 {
    public static void main(String[] args){
        int a = 4;
        int b = 3;
        int c = 2;
        Calculator1 cal = new Calculator1();
        int x = cal.multiply(a,b,c);
        System.out.println(x);
    }   
    public int multiply(int a, int b){
        return a*b;
    }
    public int multiply(int a, int b, int c){
        return a*b*c;
    }
}
