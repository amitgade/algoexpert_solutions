package easy.recursion.nth_fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amitgade on 10-Mar-2022
 */
public class Solution2 {
    // O(n) time | O(n) space
    public static int getNthFib(int n) {
        Map<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
        return nthFibonacci(n, memoize);
    }

    private static int nthFibonacci(int n, Map<Integer, Integer> memoize) {
        if (!memoize.containsKey(n)) {
            memoize.put(n, nthFibonacci(n - 1, memoize) + nthFibonacci(n - 2, memoize));
        }
        return memoize.get(n);
    }
}
