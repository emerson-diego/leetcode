public class P14_LongestCommomPrefix {

    public static void main(String args[]) {

        String array[] = { "flower", "flow", "flight" };
        // String array[] = { "a" };
        // String array[] = {"", ""};

        System.out.println(new P14_LongestCommomPrefix().longestCommonPrefix(array));

    }

    public String longestCommonPrefix(String[] array) {

        if (array.length == 0)
            return "";
        String prefix = array[0];
        for (int i = 1; i < array.length; i++)
            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

}
