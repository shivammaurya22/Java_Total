public class ErrorsInConcat {
    public static void main(String[] args) {
        int a = 3, b =2;
        int res = a + b;
        System.out.println(res); // 5
        String s = "abc"; 
        String s1 = a + s;  // 3abc
        String s2 = s + a;  // abc3
        System.out.println(s1+" "+ s2);  //3abc abc3
        System.out.println("Output is: "+ a+b);  // Output is 32
        System.out.println("output is: "+ (a+b)); // output is 5
    }
}
