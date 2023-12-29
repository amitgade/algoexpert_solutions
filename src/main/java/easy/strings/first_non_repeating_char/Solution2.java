package easy.strings.first_non_repeating_char;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amitgade on 20-Feb-2022
 */
public class Solution2 {
    // O(n) time
    // O(1) space -> constant space because length of hashmap will never increase > 26
    // (only lowercase alphabets allowed)
    public int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            Integer characterFrequency = charFrequencyMap.getOrDefault(character, 0);
            charFrequencyMap.put(character, characterFrequency + 1);
        }

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            int characterFrequency = charFrequencyMap.get(character);
            if (characterFrequency == 1) {
                return string.indexOf(character, 0);
            }
        }
        return -1;
    }
}
