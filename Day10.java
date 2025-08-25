//Group Anagrams

package DPC;
import java.util.*;
public class Day10 {
	    static ArrayList<ArrayList<String>> anagrams(String[] arr) {
	        ArrayList<ArrayList<String>> res = new ArrayList<>();
	        HashMap<String, Integer> mp = new HashMap<>();
	        
	        for (int i = 0; i < arr.length; i++) {
	            String s = arr[i];
	            char[] chars = s.toCharArray();
	            Arrays.sort(chars);
	            s = new String(chars);
	            if (!mp.containsKey(s)) {
	                mp.put(s, res.size());
	                res.add(new ArrayList<>());
	            }
	            res.get(mp.get(s)).add(arr[i]);
	        }
	        
	        return res;
	    }

	    public static void main(String[] args) {
	        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        
	        ArrayList<ArrayList<String>> res = anagrams(arr);
	        for (int i = 0; i < res.size(); i++) {
	            System.out.println(res.get(i));
	        }
	    }
	}

OUTPUT:
[eat, tea, ate]
[tan, nat]
[bat]
