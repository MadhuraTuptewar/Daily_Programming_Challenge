//Valid Parenthesis with many types

package DPC;
import java.util.Stack;
import java.util.Vector;

public class Day12 {
    public static boolean isBalanced(String s) {
        // Stack to store opening brackets
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            // Process closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // No opening bracket
                if (st.isEmpty()) return false; 
                char top = st.peek();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
                // Pop matching opening bracket
                st.pop(); 
            }
        }
        // Balanced if stack is empty
        return st.isEmpty(); 
    }

    public static void main(String[] args) {
        String[] testCases = {"[{()}]", "[()()]{}", "(]", "([{]})"};
        for (String s : testCases) {
            System.out.println("Input: " + s + " -> Output: " + (isBalanced(s) ? "true" : "false"));
        }
    }
}

OUTPUT:-
Input: [{()}] -> Output: true
Input: [()()]{} -> Output: true
Input: (] -> Output: false
Input: ([{]}) -> Output: false
