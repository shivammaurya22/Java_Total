@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class LambdaWithReturn {
    public static void main(String[] args){
        A obj = (i,j) -> i+j;
         // there is no define to return because its already gives the return type and also not define the data type int.args
         // Lambda Exxpression is only works with Functional Interfaces,
        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
