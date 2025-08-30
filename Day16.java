//LCM of 2 Numbers

package DPC;
public class Day16 {
    static int lcm(int a, int b) {        
        // Larger value
        int g = Math.max(a, b);         
        // Smaller value
        int s = Math.min(a, b);
        for (int i = g; i <= a * b; i += g) {
            if (i % s == 0)
                return i;
        }
        return a * b; 
    }    
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("LCM of a & b is: "+ lcm(a, b)); 
    }
}

OUTPUT:-
LCM of a & b is: 10


