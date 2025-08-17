//Find Duplicate Number

package DPC;
import java.util.*;
public class Day3 {
	public static int duplicateNumber(int[] nums) {
		int n=nums.length;
		Arrays.sort(nums);
		for(int i=0;i<n-1;i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//int nums[]= {3,1,3,4,2};
		//int nums[]= {1,3,4,2,2};
		int  nums[]= {1,1};
		int duplicate=duplicateNumber(nums);
		System.out.println("Duplicate Number is:"+duplicate);
	}
}

OUTPUT:-
Duplicate Number is:1
