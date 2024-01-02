package Stack;
import java.util.*;
public class ValidParantheses {

    public static boolean isOpn(char ch){
        return (ch=='{') || ch=='(' || ch=='[';
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(isOpn(ch)){
                stack.push(ch);
            }
            else if(stack.isEmpty() || !matching(stack.pop(),ch) ) return false;

        }
        return stack.isEmpty();
    }
    public static boolean matching(char opn , char close){
        return (opn=='(' && close ==')')||
                (opn=='{' && close =='}')||
                (opn=='[' && close ==']');
    }

    public static void main(String[] args) {
        String str1="()[]{}";
        String str="{][]}";
        isValid(str);
    }
}