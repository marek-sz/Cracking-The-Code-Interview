package Ch_1_Arrays_And_Strings._1_2_Check_Permutations;

import java.util.ArrayList;
import java.util.List;

public class PermChecker {

    public static boolean checkIfStringsArePermutable(String str1, String str2) {
        List<Character> list = new ArrayList<>();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (Character character : chars1) {
            list.add(character);
        }
        for (Character character : chars2) {
            list.remove(character);
        }
        return list.isEmpty();
    }
}
