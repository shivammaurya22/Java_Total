import java.util.Stack;

public class ValidparanStack {

    public boolean isValidParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if( c == ')' && top != '(') return false;
                if( c == '}' && top != '{') return false;
                if( c == ']' && top != '[') return false;
            }
        }
       return stack.isEmpty();
    }
    public static void main(String[] args) {
        // creating object 
        ValidparanStack obj = new ValidparanStack();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "{[()]}";
        boolean res1 = obj.isValidParanthesis(s1);
        boolean res2 = obj.isValidParanthesis(s2);
        boolean res3 = obj.isValidParanthesis(s3);
        boolean res4 = obj.isValidParanthesis(s4);
        boolean res5 = obj.isValidParanthesis(s5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
    }
}
