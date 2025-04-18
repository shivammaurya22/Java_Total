class AngelException extends Exception{
    public AngelException(String string){
        super(string);
    }
}

public class OwnException {
    public static void main(String[] args) {
        int i = 18;
        int j = 0;
        int divide;
        try {
            if (j == 0) 
                throw new AngelException("This is the message.");
            // if you want to handle it then you can.
        } catch (AngelException ex) {
            System.out.println("This is the default value of divide " + ex);
            // System.out.println("This is the Airthmatic exception."+ex);
        } catch (Exception e) {
            System.out.println("You can't divide by Zero." + e);
        }
    }
}
