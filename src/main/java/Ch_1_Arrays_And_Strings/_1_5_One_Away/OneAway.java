package Ch_1_Arrays_And_Strings._1_5_One_Away;

import java.util.ArrayList;
import java.util.List;

public class OneAway {
    public static boolean checkForEdits(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        String longer = str1.length() > str2.length() ? str1 : str2;
        String shorter = str1.length() < str2.length() ? str1 : str2;

        if (longer.length() - shorter.length() > 1) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char character : chars1) {
            list1.add(character);
        }
        for (char character : chars2) {
            list2.add(character);
        }

        list1.removeAll(list2);

        return list1.size() <= 1;
    }
}
