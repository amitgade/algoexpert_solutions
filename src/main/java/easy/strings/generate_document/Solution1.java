package easy.strings.generate_document;

/**
 * Created by amitgade on 18-Feb-2022
 */
public class Solution1 {
    // O(m * (n+m)) time | O(1) space
    // m -> length of document
    // n -> length of characters
    public boolean generateDocument(String characters, String document) {
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int documentFrequency = countCharacterFrequency(character, document);
            int characterFrequency = countCharacterFrequency(character, characters);
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
