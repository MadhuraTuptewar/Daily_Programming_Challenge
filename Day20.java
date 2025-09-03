//Sort a Stack Using Recursion

package DPC;
import java.util.*;
import java.util.Stack;
public class Day20 {
	    public static void sortedInsert(Stack<Integer> s, int x) {
	        if (s.isEmpty() || x < s.peek()) {
	            s.push(x);
	            return;
	        }
	        int temp = s.pop();
	        sortedInsert(s, x);
	        s.push(temp);
	    }
	    public static void sort(Stack<Integer> s) {
	        if (!s.isEmpty()) {
	            int x = s.pop();
	            sort(s);
	            sortedInsert(s, x);
	        }
	    }
	    public static void main(String[] args) {
	        Stack<Integer> s = new Stack<>();
            System.out.println("Order of Sorted stck is:");
	        s.push(11);
	        s.push(2);
	        s.push(32);
	        s.push(3);
	        s.push(41);
	        sort(s);
	        while (!s.isEmpty()) {
	            System.out.print(s.pop() + " ");
	        }
	        System.out.println();
	    }
	}

OUTPUT:-
Order of Sorted stck is:
2 3 11 32 41 
