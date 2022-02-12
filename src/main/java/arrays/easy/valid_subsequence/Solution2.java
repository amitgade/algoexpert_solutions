package arrays.easy.valid_subsequence;

import java.util.List;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution2 {
    // O(n) time | O(1) space | using for loop
    public static boolean isValidSubsequence(List<Integer> sequence, List<Integer> subSequence) {
        int subSeqIdx = 0;
        for (var value : sequence) {
            if (subSeqIdx == subSequence.size()) {
                break; // if all values of subSeq are found then stop iterating in the sequence
            }
            if (value == subSequence.get(subSeqIdx)) {
                subSeqIdx++; // we found match
            }
        }
        return subSeqIdx == subSequence.size(); // we have checked for all values in the subSequence
    }
}
