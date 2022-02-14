package easy.strings.caesar_cipher_encryptor;

/**
 * Created by amitgade on 14-Feb-2022
 */
public class Solution2 {
    // O(n) time | O(n) space
    public static String caesarCypherEncryptor(String str, int key) {

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int newKey = key % 26;
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(getEncryptedAlphabet(str.charAt(i), newKey, alphabets));
        }
        return newStr.toString();
    }

    private static char getEncryptedAlphabet(char letter, int newKey, String alphabets) {
        int newIdx = alphabets.indexOf(letter) + newKey;
        char newAlphabet = newIdx >= 26 ? alphabets.charAt(newIdx % 26) : alphabets.charAt(newIdx);
        return newAlphabet;
    }
}
