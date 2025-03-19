public class ScopeVariable {
    public static void main(String[] args) {
        // Main Method
        int x = 4;
        x++;
        {   // start the block 
            int y = 5;
            y++;
        }    // end the block
        System.out.println(x);
        System.out.println(y);  // you can't access this variable outside this is called scope {  }.
    }
}
