package Ch_1_Arrays_And_Strings._1_6_String_Compression;

public class StringComp {
    public static String compress(String string) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            counter++;
            if (i + 1 >= string.length() || string.charAt(i) != string.charAt(i + 1)) {
                sb.append(string.charAt(i)).append(counter);
                counter = 0;
            }
        }
        return string.length() > sb.toString().length() ? sb.toString() : string;
    }
}