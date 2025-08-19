//Merge two Sorted Arrays

package DPC;
import java.util.*;
public class Day4 {
	public static void mergeTwoSorted(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int[] merged=new int[n+m];
		for(int i=0;i<n;i++) {
			merged[i]=arr1[i];
		}
		for(int j=0;j<m;j++) {
			merged[n+j]=arr2[j];
		}
		Arrays.sort(merged);
		for(int i=0;i<n;i++) {
			arr1[i]=merged[i];
		}
		for(int j=0;j<m;j++) {
			arr2[j]=merged[n+j];
		}
	}
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,4,6,8};
		mergeTwoSorted(arr1,arr2);
		System.out.print("Array 1 is: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("Array 2 is: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
}

OUTPUT:-
Array 1 is: 1 2 3 4 
Array 2 is: 5 6 7 8 
