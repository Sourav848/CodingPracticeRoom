import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Testing1 {
    
    public static int coinChange(List<Integer> coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
          for (int i = coin; i <= amount; i++) {
            dp[i] += dp[i - coin];
          }
        }

        return dp[amount];
      }
    
    
    
    public static void main(String args[]) {
        
        List<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(5);

        int amount = 10;

        int numCombinations = coinChange(coins, amount);

        System.out.println("Number of combinations: " + numCombinations);
        
        
    }
}
