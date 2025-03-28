import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
     Stack<String> stack = new Stack<>();
     stack.push("Java");
     stack.push("Python");
     stack.push("C++");

     // Peek the element 
     System.out.println(stack.peek());

     // popping the element 
     System.out.println(stack.pop());

     // size of the stack
     System.out.println(stack.size());

     // isempty check stack
     System.out.println(stack.isEmpty());
    }
}
