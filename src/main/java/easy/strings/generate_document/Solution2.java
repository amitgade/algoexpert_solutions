package easy.strings.generate_document;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amitgade on 18-Feb-2022
 */
public class Solution2 {
    // O(k + (n+m)) time | O(1) space
    // k -> number of unique characters in document
    // m -> length of document
    // n -> length of characters
    public boolean generateDocument(String characters, String document) {
        for (int i = 0; i < document.length(); i++) {

            Set<Character> uniqueChars = new HashSet<>();
            char currentChar = document.charAt(i);

            if (uniqueChars.contains(currentChar)) {
                continue;
            }

            int documentFrequency = countCharacterFrequency(currentChar, document);
            int characterFrequency = countCharacterFrequency(currentChar, characters);

            if (documentFrequency > characterFrequency) {
                return false;
            }
        }
        return true;
    }

    private int countCharacterFrequency(char character, String target) {
        int frequency = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == character) {
                frequency++;
            }
        }
        return frequency;
    }
}
