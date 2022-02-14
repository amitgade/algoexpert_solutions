package easy.strings.caesar_cipher_encryptor;

/**
 * Created by amitgade on 14-Feb-2022
 */
public class Solution1 {
    // O(n) time | O(n) space
    public static String caesarCypherEncryptor(String str, int key) {

        int newKey = key % 26;
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(getEncryptedAlphabet(str.charAt(i), newKey));
        }
        return newStr.toString();
    }

    private static char getEncryptedAlphabet(char letter, int newKey) {
        int newIdx = letter + newKey;
        return (char) (newIdx > 122 ? (96 + newIdx % 122) : newIdx);
    }
}
