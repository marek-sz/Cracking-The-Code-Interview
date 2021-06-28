package Ch_1_Arrays_And_Strings._1_9_String_Rotation;

public class StringRotation {
    public static boolean isSubstring(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            str1 = sb.toString();
            sb.append(str1.charAt(0));
            sb.deleteCharAt(0);
            if (sb.toString().equals(str2)) {
                return true;
            }
        }
        return false;
    }
}