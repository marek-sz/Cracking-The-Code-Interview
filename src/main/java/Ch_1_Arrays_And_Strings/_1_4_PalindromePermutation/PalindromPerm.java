package Ch_1_Arrays_And_Strings._1_4_PalindromePermutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromPerm {
    public static boolean checkIfPalindrome(String string) {
        Map<Character, Integer> hashMap = new HashMap<>();
        char[] chars = string.replaceAll("\\s", "").toLowerCase().toCharArray();
        for (char c : chars) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        List<Character> characterList = new ArrayList<>(hashMap.keySet());
        for (Character character : hashMap.keySet()) {
            if (hashMap.get(character) % 2 == 0) {
                characterList.remove(character);
            }
        }
        return characterList.size() <= 1;
    }
}
