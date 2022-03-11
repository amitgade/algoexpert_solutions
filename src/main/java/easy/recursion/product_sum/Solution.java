package easy.recursion.product_sum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 11-Mar-2022
 */
public class Solution {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    // TODO: 11/03/22 Solution starts

    // O(n) time | O(d) space
    // n -> length of given special array
    // d -> depth of special array
    public static int productSum(List<Object> array) {
        return findProductSum(array, 1);
    }

    private static int findProductSum(List<Object> list, int depth) {
        int productSum = 0;
        for (Object o : list) {
            if (o instanceof ArrayList) {
                ArrayList<Object> os = (ArrayList<Object>) o;
                productSum += findProductSum(os, depth + 1);
            } else {
                productSum += (int) o;
            }
        }
        return productSum * depth;
    }

    // TODO: 11/03/22 Solution ends
}
