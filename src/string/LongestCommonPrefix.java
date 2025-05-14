package string;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);  // pick character from first string
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);  // mismatch found
            }
        }

        return strs[0];  // all characters matched, return full first string
    }


    public static void main(String[] args) {
        String[] arr = { "interview", "internet", "internal" };
        System.out.println(longestCommonPrefix(arr));
    }
}
