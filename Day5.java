//Find Leaders in an array

package DPC;
import java.util.*;
public class Day5 {
	public static ArrayList<Integer> Leaders(int[] arr){
		ArrayList<Integer>result=new ArrayList();
		int n=arr.length;
		int maxRight=arr[n-1];
		result.add(maxRight);
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=maxRight) {
				maxRight=arr[i];
				result.add(maxRight);
			}
		}
		Collections.reverse(result);
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		ArrayList<Integer>result=Leaders(arr);
		System.out.println("Leaders Are: ");
		for(int res:result) {
			System.out.print(res+" ");
		}
		System.out.println();
	}
}

OUTPUT:-
Leaders Are: 
17 5 2 

