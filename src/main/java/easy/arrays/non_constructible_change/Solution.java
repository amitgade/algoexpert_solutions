package easy.arrays.non_constructible_change;

import java.util.Arrays;

/**
 * Created by amitgade on 14-Feb-2022
 */
public class Solution {
    // O(n.log(n)) time | O(n) space
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins); // Sort O(n.log(n)) time

        int currentChangeCreated = 0;

        // if next coin > (sum of change + 1) means we can't create (change + 1)
        for (int coin : coins) {
            if (coin > currentChangeCreated + 1) {
                return currentChangeCreated + 1;
            } else {
                currentChangeCreated += coin;
            }
        }
        return currentChangeCreated + 1;
    }
}
