package easy.strings.generate_document;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amitgade on 17-Feb-2022
 */
public class Solution3 {
    // O(n+m) time | O(k) space
    // n -> length of characters
    // m -> length of document
    // k -> number of unique characters i.e. to be stored in HashMap
    public boolean generateDocument(String characters, String document) {
        if (characters.length() < document.length()) {
            return false;
        }

        Map<Character, Integer> mapOfOccurrence = new HashMap<>();

        // increment occurrences into HashMap value
        for (int i = 0; i < characters.length(); i++) {
            Character currentChar = characters.charAt(i);
            mapOfOccurrence.put(currentChar, mapOfOccurrence.getOrDefault(currentChar, 0) + 1);
        }

        // decrement occurrences from HashMap value
        for (int i = 0; i < document.length(); i++) {
            Character currentChar = document.charAt(i);
            if (!mapOfOccurrence.containsKey(currentChar) || mapOfOccurrence.get(currentChar) == 0) {
                return false;
            }
            mapOfOccurrence.put(currentChar, mapOfOccurrence.get(currentChar) - 1);
        }
        return true;
    }
}
