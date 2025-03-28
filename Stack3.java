import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        // Reverse the String
        String str = "Java";
        Stack<Character> stack = new Stack<>();
        
        // push characters to the stack
        for(char ch: str.toCharArray()){
            stack.push(ch);
        }

        // pop charaters and print in reverse
        System.out.println("Reversed: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
