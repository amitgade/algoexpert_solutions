package easy.strings.first_non_repeating_char;

/**
 * Created by amitgade on 20-Feb-2022
 */
public class Solution1 {
    // O(n^2) time | O(n) space -> n is length of input string
    public int firstNonRepeatingCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            boolean foundDuplicate = false;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j) && (i != j)) {
                    foundDuplicate = true;
                    break;
                }
            }
            if (!foundDuplicate) {
                return i;
            }
        }
        return -1;
    }
}
