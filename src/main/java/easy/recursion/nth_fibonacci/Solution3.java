package easy.recursion.nth_fibonacci;

/**
 * Created by amitgade on 10-Mar-2022
 */
public class Solution3 {

    // TODO: 10/03/22 Solution starts
    // O(n) time | O(1) space
    public static int getNthFib(int n) {
        int[] lastTwo = {0, 1};
        int counter = 3;

        // for n<=2 will not enter this loop
        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }

        if (n > 1) {
            return lastTwo[1];
        } else {
            // n==1 or n<1 return 0
            return lastTwo[0];
        }
    }
}
