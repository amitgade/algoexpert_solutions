package easy.strings.run_length_encoding;

/**
 * Created by amitgade on 15-Feb-2022
 */
public class Solution {
    // O(n) time | O(n) space
    public String runLengthEncoding(String string) {
        StringBuilder encodedString = new StringBuilder();
        int runLength = 1; // given that string will always be non-empty

        for (int i = 1; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i - 1);

            if ((currentCharacter != previousCharacter) || runLength == 9) {
                encodedString.append(runLength);
                encodedString.append(previousCharacter);
                runLength = 0;
            }
            runLength++;
        }
        encodedString.append(runLength);
        encodedString.append(string.charAt(string.length() - 1));

        System.out.println(encodedString.toString());
        return encodedString.toString();
    }


}
