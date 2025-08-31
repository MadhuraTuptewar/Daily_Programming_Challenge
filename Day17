//Prime Factorization of a number

package DPC;
import java.util.ArrayList;
import java.util.*;
public class Day17{
		  public static ArrayList<Integer> primeFactor(int n) {
		      ArrayList<Integer> ans = new ArrayList<>();
		        // Loop from 2 to n
		        for (int i = 2; i <= n; i++) {
		             // n % i == 0 means n is divisible by i
		            while (n % i == 0 && n > 0) {
		                ans.add(i);
		                 // divide n by i to remove this factor
		                n = n / i; 
		            }
		        }
		        return ans;
		    }
		public static void main (String[] args) {
		      int n = 18;
		      ArrayList<Integer> ans = primeFactor(n);
		      System.out.println("Factors of "+n+" are: ");
		        for (int x : ans) {
		            System.out.print( x + " ");
		        }
		    }
		}

OUTPUT:-
Factors of 18 are: 
2 3 3 
