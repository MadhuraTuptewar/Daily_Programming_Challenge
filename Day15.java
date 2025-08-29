// Find the Longest substring without repeating characters (only lowercase letters)

package DPC;
public class Day15 {
    static String longestUniqueSubstr(String s) {
        int n = s.length();
        int res = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {
            // track visited lowercase chars
            boolean[] vis = new boolean[26]; 
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                
                // If already visited, break
                if (vis[idx])
                    break;

                // Else mark visited and update answer
                vis[idx] = true;
                if (res < j - i + 1) {
                    res = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String result = longestUniqueSubstr(s);
        System.out.println("Longest Substring is: " + result);
        System.out.println("Length: " + result.length());
    }
}

OUTPUT:-
Longest Substring is: abc
Length: 3
