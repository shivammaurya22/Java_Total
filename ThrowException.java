public class ThrowException {
    public static void main(String[] args){
        int i = 18;
        int j =0;
        int divide;
        try {
            divide = i/j;
            if (j ==0){
                throw new ArithmeticException();
            }
            System.out.println(divide);
            // if you want to handle it then you can.
        }catch (ArithmeticException ex){
              divide = i/1;
              System.out.println("This is the default value of divide "+ divide);
           // System.out.println("This is the Airthmatic exception."+ex);
        }
         catch (Exception e) {
            System.out.println("You can't divide by Zero."+ e);
        }
    }
}
