package string;
// Leet code
// Q1941. Check if All Characters Have Equal Number of Occurrences

//Input: s = "abacbc"
//Output: true
//Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

//Input: s = "aaabb"
//Output: false
//Explanation: The characters that appear in s are 'a' and 'b'.
//        'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

import java.util.HashMap;
import java.util.Map;

public class AllCharEqNoOccurrence {

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        if (s == null || s.isEmpty())
            return false;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int len = map.get(s.charAt(0));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (len != entry.getValue())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println(areOccurrencesEqual(s));
    }

}
