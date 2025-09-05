//First Element to Repeat k Times

package DPC;
import java.util.*;
public class Day22 {
	public static int firstElement(int[] arr,int n,int k) {
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==k) {
				return arr[i];
			}
		}
		return -1;		
	}
	public static void main(String[] args) {
		int[] arr= {3, 1, 4, 4, 5, 2, 6,1, 4};
		int n=arr.length;
		int k=2;
		System.out.println("First Element to repeat K Times is :" +firstElement(arr,n,k));		
	}
}

OUTPUT:-
First Element to repeat K Times is :1
