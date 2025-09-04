//Reverse Stack using Recursion

package DPC;
import java.util.Stack;
public class Day21 {
    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int a = s.pop();
            insertAtBottom(s, x);
            s.push(a);
        }
    }
    public static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertAtBottom(s, x);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println("Reversed Stack is: ");
        // Pushing elements to the stack: 4 3 2 1 (bottom to top)
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // Reversing the stack
        reverse(s);        
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}

OUTPUT:-
Reversed Stack is: 
1 2 3 4 
