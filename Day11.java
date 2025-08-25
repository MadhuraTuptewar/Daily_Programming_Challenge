//Permutations of String

package DPC;
import java.util.*;
public class Day11 {
	    static void recurPermute(int index, StringBuilder s, List<String> ans) {
	        if (index == s.length()) {
	            ans.add(s.toString());
	            return;
	        }
	        for (int i = index; i < s.length(); i++) {
	            swap(s, index, i);
	            recurPermute(index + 1, s, ans);
	            swap(s, index, i);
	        }
	    }

	    static void swap(StringBuilder s, int i, int j) {
	        char temp = s.charAt(i);
	        s.setCharAt(i, s.charAt(j));
	        s.setCharAt(j, temp);
	    }

	    static List<String> findPermutation(String s) {
	        List<String> ans = new ArrayList<>();
	        StringBuilder str = new StringBuilder(s);

	        recurPermute(0, str, ans);
	        Collections.sort(ans);

	        return ans;
	    }

	    public static void main(String[] args) {
	        String s = "abc";
	        List<String> res = findPermutation(s);
	        for (String x : res) {
	            System.out.print(x + " ");
	        }
	    }
	}

OUTPUT:-
abc acb bac bca cab cba 
