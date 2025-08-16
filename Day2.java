//Missing Number

package DPC;
import java.util.Arrays;
import java.util.Scanner;
public class Day2 {
	public static int missingNumber(int[] nums) {
		int n=nums.length+1;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		int expectedSum=(n*(n+1))/2;
		return (expectedSum-sum);
	}

	public static void main(String[] args) {
		int[] nums= {1,2,4,5};	
		int missing=missingNumber(nums);
		System.out.println("Missing Number is:"+missing);
	}
}

OUTPUT:
Missing Number is:3
