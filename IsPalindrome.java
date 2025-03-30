import java.util.Stack;

public class IsPalindrome {

    public static boolean PalindromeCheck(String word){
        Stack<Character> stack = new Stack<>();
        int n = word.length();

        // Push first half of the word onto the Stack
        for(int i = 0; i< n/2; i++){
            stack.push(word.charAt(i));
        }

        // compare second half of the word onto the stack
        for(int i = (n+1)/2; i < n; i++){
            if(stack.pop() != word.charAt(i)){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
      String word1 = "madam";
      String word2 = "hello";
      System.out.println("checking: "+PalindromeCheck(word1));
      System.out.println(PalindromeCheck(word2));
    }
}
