//Evaluate a Postfix Expression

package DPC;
import java.util.*;
import java.util.Stack;

public class Day19 {

    // Function to evaluate postfix expression
    static int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String token = arr[i];

            // If the token is a number, push it onto the stack
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } 
            // Otherwise, it must be an operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "*":
                        stack.push(val2 * val1);
                        break;
                    case "/":
                        stack.push(val2 / val1);
                        break;
                    case "^":   // Exponentiation
                        stack.push((int)Math.pow(val2, val1));
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        // Example: (2 ^ 3) + (1 * 2)
        String[] arr = {"2", "3", "^", "1", "2", "*", "+"};
        System.out.println("Answer of Evaluated Expression is: " + evaluatePostfix(arr));
    }
}

OUTPUT:-
Answer of Evaluated Expression is: 10
