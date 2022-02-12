package easy.arrays.valid_subsequence;

import java.util.List;

/**
 * Created by amitgade on 12-Feb-2022
 */
public class Solution1 {
    // O(n) time | O(1) space | using while loop
    public static boolean isValidSubsequence(List<Integer> sequence, List<Integer> subSequence) {
        int seqIdx = 0;
        int subSeqIdx = 0;

        while (seqIdx < sequence.size() && subSeqIdx < subSequence.size()) {
            if (sequence.get(seqIdx) == subSequence.get(subSeqIdx)) {
                // we found match
                // increment subSeqIdx
                subSeqIdx++;
            }
            // in either case increment seqIdx
            seqIdx++;
        }
        return subSeqIdx == subSequence.size(); // we have checked for all values in subSequence
    }
}
