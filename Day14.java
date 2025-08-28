//Count Substrings with Exactly K Distinct Characters

package DPC;
import java.util.*;
public class Day14 {
	    static int countSubstr(String s, int k) {
	        int n = s.length();
	        int ans = 0;
	        for (int i = 0; i < n; i++) {
	            // array to check if a character is present in substring i..j
	            boolean[] map = new boolean[26];
	            int distinctCnt = 0;
	            for (int j = i; j < n; j++) {
	                // if new character is present,increment distinct count.
	                if (!map[s.charAt(j) - 'a']) {
	                    map[s.charAt(j) - 'a'] = true;
	                    distinctCnt++;
	                }
	                // if distinct count is equal to k.
	                if (distinctCnt == k) ans++;
	            }
	        }
	        return ans;
	    }
	    public static void main(String[] args) {
	        String s = "pqpqs";
	        int k = 2;
	        System.out.println("No. of Substrings are: " + countSubstr(s, k));
	    }
	}
	


OUTPUT:-
No. of Substrings are: 7
