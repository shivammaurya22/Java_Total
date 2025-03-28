import java.util.Stack;

public class Stack1{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println("Top of the Element: "+stack.peek());
        System.out.println("Pop operation perform: "+stack.pop());
        System.out.println("Empty or not: "+stack.isEmpty());
        System.out.println("The size of the Stack is: "+stack.size());
        System.out.println(stack);
    }
}