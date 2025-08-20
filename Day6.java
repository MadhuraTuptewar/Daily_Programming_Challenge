// Find All Subarrays with sum 0

package DPC;
import java.util.*;
public class Day6 {
    public static void findSubarrays(int[] nums) {
        boolean found = false; 
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {  
                sum += nums[j];
                if (sum == 0) {
                    found = true;
                    System.out.print("Subarray index from : [" + i + " to " + j + "] have sum 0 --> ");
                    // print actual elements
                    for (int k = i; k <= j; k++) {
                        System.out.print(nums[k] + ", ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.println("No subarray with sum 0 exists.");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 3, -1, 2};   // test case
        // int[] nums = {1, 2, 3, 4}; // case with no 0-sum subarray
        findSubarrays(nums);
    }
}

OUTPUT:
Subarray index from : [0 to 2] have sum 0 --> 1, 2, -3, 
Subarray index from : [2 to 3] have sum 0 --> -3, 3, 
