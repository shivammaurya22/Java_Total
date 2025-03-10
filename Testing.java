public class Testing {
    public static void main(String[] args) {
      String name = "madam";
      String name2 = "hello";
        checkPailndrome(name);
        checkPailndrome(name2);
    }
    public static void checkPailndrome(String name){
        if(name == null || name.isEmpty()){
            System.out.println("The string is not valid."); 
            return; 
        }
        // using pointers 
        int i = 0;
        int j = name.length() - 1;
        while(i < j){
            if (name.charAt(i) != name.charAt(j)) {
                System.out.println("\"" + name + "\" is not a palindrome.");
                return; // Not a palindrome
            }
            i++;
            j--;
        }
        System.out.println("\"" + name + "\" is a palindrome.");
    }
}