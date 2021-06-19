package Ch_1_Arrays_And_Strings._1_2_Check_Permutations;

import java.util.ArrayList;
import java.util.List;

public class PermChecker {

    public static boolean checkIfStringsArePermutable(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        for (Character character : str1.toCharArray()) {
            list.add(character);
        }
        for (Character character : str2.toCharArray()) {
            list.remove(character);
        }
        return list.isEmpty();
    }

    // 2.nd solution
    public static boolean permutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // number of ASCII characters
        int[] letters = new int[128];

        for (char character : str1.toCharArray()) {
            letters[character]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}