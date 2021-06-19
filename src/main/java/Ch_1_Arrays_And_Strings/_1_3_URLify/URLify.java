package Ch_1_Arrays_And_Strings._1_3_URLify;

public class URLify {
    private static final String replacement = "%20";

    public static String replace(String string) {
        string = string.trim();
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();

        for (char character : chars) {
            if (character != ' ') {
                sb.append(character);
            } else if (sb.toString().charAt(sb.toString().length() - 1) != '0') {
                sb.append(replacement);
            }
        }
        return sb.toString();
    }
}