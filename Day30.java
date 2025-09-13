//The Coin Change Problem

package DPC;
import java.util.*;
public class Day30 {
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;  // large value
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }      
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount)); // Output: 3
    }
 }

output:-
3
