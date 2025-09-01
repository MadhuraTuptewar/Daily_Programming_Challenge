//Print & count the Number of Divisors of a Number

package DPC;
import java.util.*;
import java.util.ArrayList;
public class Day18 {
	public static void divisor(int number) {
	List<Integer>divisors=new ArrayList<>();
	int count=0 ;
	for(int i=1;i<=number;i++) {
		if(number%i==0) {
			divisors.add(i);
			count++;
		}
	}
	System.out.println("Divisors of Number " +number+": "+divisors);
	System.out.println("Total divisors :"+count);
	}
	public static void main(String args[]) {
		int number=1000;
		divisor(number);		
	}
}

OUTPUT:-
Divisors of Number 1000 : [1, 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 125, 200, 250, 500, 1000]
Total divisors :16
