public class ScopeVariable {
   // static int y;   // if you can access the value of y. option 1.
    public static void main(String[] args) {
        // Main Method
        int y =0;  // if you can access the value of y. option 2.
        int x = 4;
        x++;
        {   // start the block 
            y = 5;
            y++;
        }    // end the block
        System.out.println(x);
        System.out.println(y);  // you can't access this variable outside this is called scope {  }.
    }
}
