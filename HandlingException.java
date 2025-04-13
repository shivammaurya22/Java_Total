public class HandlingException {
    public static void main(String[] args) {
        try
        {
            int i = 9;
            int j = 0;
            int result = i / j;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Something Went worng.");
        }
        System.out.println("Bye");
    }
}
