package Ch_1_Arrays_And_Strings._1_1_Is_Unique;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static boolean isUnique(String word) {
        Set<Character> characters = new HashSet<>();
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            characters.add(aChar);
        }
        return word.length() == characters.size();
    }

    //optimal solution
    public static boolean isUniqueChars(String string) {
        if (string.length() > 128) {
            return false;
        }
        boolean[] chars = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            int val = string.charAt(i);
            if (chars[val]) {
                return false;
            }
            chars[val] = true;
        }
        return true;
    }
}